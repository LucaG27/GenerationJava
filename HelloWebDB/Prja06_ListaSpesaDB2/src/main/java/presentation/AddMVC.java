package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;
import repository.Database;
import utility.SessionGuard;

import java.io.IOException;
import java.util.List;

@WebServlet("/aggiungiProdotto")
public class AddMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionGuard.getSessionGuard().validateSession(request, response);
		try {
		Database db = Database.getDatabase();
		
		String emailUtente= request.getSession().getAttribute("email").toString();
		List<Prodotto> lista = db.getListaSpesa(emailUtente);
		
		lista.add(new Prodotto(
				lista.size(), //Non è possibile fare lista.size()++
				request.getParameter("nome"), 
				Double.parseDouble(request.getParameter("prezzo")),
				request.getParameter("reparto")
				));
		
		request.setAttribute("lista", lista);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}