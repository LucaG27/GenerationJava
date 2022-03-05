package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import controller.LibroController;

@WebServlet ("/listaLibri")
public class ListaLibri extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private LibroController controller;
    
    public ListaLibri() throws ClassNotFoundException, SQLException {
    	controller = LibroController.getController();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Libro> listaLibri;
		try {
			listaLibri = controller.getAllLibri();
			request.setAttribute("listaLibri", listaLibri);
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		request.getRequestDispatcher("lLibro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Libro> listaLibri;
		try {
			listaLibri = controller.getAllLibri();
			request.setAttribute("listaLibri", listaLibri);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("lLibro.jsp").forward(request, response);
	}
}