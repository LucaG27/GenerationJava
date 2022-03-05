package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Libro;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import controller.LibroController;

@WebServlet("/modificaLibro")
public class ModLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LibroController controller;

	public ModLibro() throws ClassNotFoundException, SQLException {
		controller = LibroController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idDaModificare = Integer.parseInt(request.getParameter("modificaId"));
			Libro lb = controller.getLibroById(idDaModificare);
			request.setAttribute("id", lb.getId());
			request.setAttribute("titolo", lb.getTitolo());
			request.setAttribute("prezzo", lb.getPrezzo());
			request.setAttribute("pagine", lb.getPagine());
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}

		request.getRequestDispatcher("modLibro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));

			controller.updateLibro(id, titolo, prezzo, pagine);
			request.setAttribute("avvisoMessaggio","Libro aggiornato con successo!");

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}

		request.getRequestDispatcher("listaLibri").forward(request, response);
	}

}
