package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreController;

@WebServlet("/delAutore")
public class DelAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreController controller;

	public DelAutore() throws ClassNotFoundException, SQLException {
		controller = AutoreController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idAutore = Integer.parseInt(request.getParameter("idAutore"));
		try {
			int AutoreCancellato = controller.deleteAutore(idAutore);
			if (AutoreCancellato == 1)
				request.setAttribute("avvisoMessaggio", "Autore cancellato con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, cancellati " + AutoreCancellato + " records.");
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		request.getRequestDispatcher("listaAutori").forward(request, response);
	}
}