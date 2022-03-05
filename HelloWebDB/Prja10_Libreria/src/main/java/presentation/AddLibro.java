package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

import java.sql.SQLException;


import controller.LibroController;

@WebServlet ("/aggiungiLibro")
public class AddLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroController controller;

	public AddLibro() throws ClassNotFoundException, SQLException {
		controller = new LibroController();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.getRequestDispatcher("aLibro.jsp").forward(request, response);
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("id") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));

			try {
				this.controller.insertLibro(id, titolo, prezzo, pagine);
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", e.getMessage());
			}
			request.getRequestDispatcher("listaLibri").forward(request, response);

		}
	}
}
