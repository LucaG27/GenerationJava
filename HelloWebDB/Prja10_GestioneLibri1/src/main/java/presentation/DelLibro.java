package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

import controller.LibroController;

@WebServlet("/cancellaLibro")
public class DelLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LibroController controller;

	public DelLibro() throws ClassNotFoundException, SQLException {
		controller = LibroController.getController();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("deleteId") != null) {
			int idLibro = Integer.parseInt(request.getParameter("deleteId"));
			try {
				this.controller.deleteLibro(idLibro);
				request.setAttribute("avvisoMessaggio", "Libro cancellato con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("avvisoMessaggio", e.getMessage());
			}
		}
		request.getRequestDispatcher("listaLibri").forward(request, response);
	}
}
