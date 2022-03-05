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

@WebServlet("/carrello")
public class CarrelloMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	double totale = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Database db = Database.getDatabase();
		List<Prodotto> tot = db.getLista();

		for (Prodotto p : tot) {
			totale += p.getPrezzo();
		}
		request.setAttribute("totaleCarrello", totale);
		request.getRequestDispatcher("carrello.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("sommaPagare") != null) {
			Double pagamento = Double.parseDouble(request.getParameter("sommaPagare"));
			if (pagamento > 0) {
				totale -= pagamento;
			}
			request.setAttribute("totaleCarrello", totale);
			request.getRequestDispatcher("carrello.jsp").forward(request, response);
		}
	}
}
