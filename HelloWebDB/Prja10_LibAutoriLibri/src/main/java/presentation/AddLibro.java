package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AutoreLibro;

import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreLibroController;
import controller.LibroController;

@WebServlet("/aggiungiLibro")
public class AddLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroController ctrl;
	public AddLibro() throws ClassNotFoundException, SQLException {
		ctrl = new LibroController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("addLibro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("libroId") != null) {
			int libroId = Integer.parseInt(request.getParameter("libroId"));
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));

			try {
				this.ctrl.insertLibro(libroId, titolo, prezzo, pagine);
				request.setAttribute("avvisoMessaggio", "Libro aggiunto con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("avvisoMessaggio", e.getMessage());
			}
			request.getRequestDispatcher("listaLibri").forward(request, response);
		}
	}
}
