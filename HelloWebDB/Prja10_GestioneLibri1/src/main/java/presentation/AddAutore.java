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

@WebServlet("/aggiungiAutore")
public class AddAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreController ctrl;

	public AddAutore() throws ClassNotFoundException, SQLException {
		ctrl = new AutoreController();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("addAutore.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("autoreId") != null) {
			int autoreId = Integer.parseInt(request.getParameter("autoreId"));
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String nazionalita = request.getParameter("nazionalita");

			try {
				this.ctrl.insertAutore(autoreId, nome, cognome, nazionalita);
				request.setAttribute("avvisoMessaggio", "Autore aggiunto con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("avvisoMessaggio", e.getMessage());
			}
			request.getRequestDispatcher("listaAutori").forward(request, response);
		}
	}
}
