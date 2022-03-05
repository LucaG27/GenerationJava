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

@WebServlet("/genere")
public class GenereMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = Database.getDatabase();
		List<SerieTv> listaGenere = new ArrayList <>();
		if (request.getParameter("genere") != null) {
			for (SerieTv s : db.getLista()) {
				if (s.getGenere().equals(request.getParameter("genere")))
					listaGenere.add(s);
			}
			request.setAttribute("genere", listaGenere);

		} else {
			request.setAttribute("genere", db.getLista());
		}
		request.getRequestDispatcher("genere.jsp").forward(request, response);
	}
}
