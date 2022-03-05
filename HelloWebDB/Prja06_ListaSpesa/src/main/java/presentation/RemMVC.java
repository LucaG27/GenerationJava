package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Database;
import model.Prodotto;

import java.io.IOException;
import java.util.List;

@WebServlet("/removeProdotto")
public class RemMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int id = Integer.parseInt( (String) request.getParameter("id"));
		Database db = Database.getDatabase();
		List<Prodotto> lista = db.getLista();
	
		for (Prodotto p : lista) {
			if (p.getId() == id) {
				lista.remove(p);
				break;
			}
		}
		request.setAttribute("lista",lista);
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}
}
