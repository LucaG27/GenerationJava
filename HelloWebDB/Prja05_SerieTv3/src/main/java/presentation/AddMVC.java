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


@WebServlet ("/aggiungiSerie")
public class AddMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = Database.getDatabase();
		List<SerieTv> lista = db.getLista();
		
		lista.add(new SerieTv(
				lista.size()+1,
				request.getParameter("nome"),
				request.getParameter("genere"),
				request.getParameter("descrizione"),
				request.getParameter("foto")
				));
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}
}
