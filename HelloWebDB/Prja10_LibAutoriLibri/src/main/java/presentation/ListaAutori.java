package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Autore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import controller.AutoreController;
import controller.LibroController;

@WebServlet("/listaAutori")
public class ListaAutori extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreController controller;

	public ListaAutori() throws ClassNotFoundException, SQLException {
		controller = AutoreController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Autore> listaAutore;
		try {
			listaAutore = controller.getAllAutori();
			request.setAttribute("listaAutori", listaAutore);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("autore.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
