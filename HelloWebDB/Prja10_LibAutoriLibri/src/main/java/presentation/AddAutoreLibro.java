package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AutoreLibro;

import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreController;
import controller.AutoreLibroController;
import controller.LibroController;

@WebServlet("/aggiungiAutoreLibro")
public class AddAutoreLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreLibroController ctrl;

	public AddAutoreLibro() throws ClassNotFoundException, SQLException {
		ctrl = new AutoreLibroController();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("addAutoreLibro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("autoreId") != null) {
			int autoreId = Integer.parseInt(request.getParameter("autoreId"));
			int libroId = Integer.parseInt(request.getParameter("libroId"));

			try {
				this.ctrl.insertAutoreLibroId(autoreId, libroId);
				request.setAttribute("avvisoMessaggio", "Associazione creata con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("avvisoMessaggio", e.getMessage());
			}
			request.getRequestDispatcher("listaAutoriLibri").forward(request, response);
		}
	}
}
