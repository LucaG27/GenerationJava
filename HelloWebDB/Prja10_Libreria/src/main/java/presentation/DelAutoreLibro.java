package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreLibroController;

@WebServlet("/delAutoreLibro")
public class DelAutoreLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreLibroController controller;

	public DelAutoreLibro() throws ClassNotFoundException, SQLException {
		controller = AutoreLibroController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("deleteId") != null) {
			int idAutoreLibro = Integer.parseInt(request.getParameter("deleteId"));
			try {
				controller.deleteAutoreLibro(idAutoreLibro);
				request.setAttribute("avvisoMessagio", "Associazione cancellata con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("avvisoMessagio", e.getMessage());
			}
			request.getRequestDispatcher("listaAutoriLibri").forward(request, response);
		}
	}
}