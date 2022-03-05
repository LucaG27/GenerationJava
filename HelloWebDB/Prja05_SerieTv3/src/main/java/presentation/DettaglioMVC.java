package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Database;
import model.SerieTv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dettaglio")
public class DettaglioMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = Database.getDatabase();
		List<SerieTv> listaDettaglio = new ArrayList <>();
		if (request.getParameter("id") != null) {
			for (SerieTv s : db.getLista()) {
				if (s.getId() == Integer.parseInt(request.getParameter("id")))
					listaDettaglio.add(s);
			}
			request.setAttribute("dettaglio", listaDettaglio);

		} else {
			request.setAttribute("dettaglio", db.getLista());
		}
		request.getRequestDispatcher("dettaglio.jsp").forward(request, response);
	}
}