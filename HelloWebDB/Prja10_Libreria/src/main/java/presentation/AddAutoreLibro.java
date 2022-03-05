package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreLibroController;

@WebServlet("/aggiungiAutoreLibro")
public class AddAutoreLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreLibroController controller;
	
    public AddAutoreLibro() throws ClassNotFoundException, SQLException {
    	controller = new AutoreLibroController();  
    	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("aAutoreLibro.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        if (request.getParameter("alAutoreId") != null) {
            int alAutoreId = Integer.parseInt(request.getParameter("alAutoreId"));
            int alLibroId = Integer.parseInt(request.getParameter("alLibroId"));
            
            try {
                this.controller.insertAutoreLibroId(alAutoreId, alLibroId);
            } catch (SQLException e) {
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.getRequestDispatcher("listaAutoriLibri").forward(request, response);
        }
    }

}
