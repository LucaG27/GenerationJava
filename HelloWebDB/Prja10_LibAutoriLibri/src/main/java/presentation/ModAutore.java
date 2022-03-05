package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Autore;
import model.Libro;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import controller.AutoreController;
import controller.LibroController;

@WebServlet("/modificaAutore")
public class ModAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AutoreController controller;

	public ModAutore() throws ClassNotFoundException, SQLException {
		controller = AutoreController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idDaModificare = Integer.parseInt(request.getParameter("modificaId"));
			Autore at = controller.getAutoreById(idDaModificare);
			request.setAttribute("id", at.getId());
			request.setAttribute("nome", at.getNome());
			request.setAttribute("cognome", at.getCognome());
			request.setAttribute("nazionalita", at.getNazionalita());
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}

		request.getRequestDispatcher("modAutore.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("autoreId"));
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String nazionalita = request.getParameter("nazionalita");

			this.controller.updateAutore(id, nome, cognome, nazionalita);
			request.setAttribute("avvisoMessaggio", "Autore aggiornato con successo!");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}

		request.getRequestDispatcher("listaAutori").forward(request, response);
	}

}
