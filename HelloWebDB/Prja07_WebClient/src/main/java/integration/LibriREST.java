package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.LibroDAO;
import dal.LibroIDAO;

@WebServlet("/api/libri")
public class LibriREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private LibroIDAO repo;

    public LibriREST() {
    	repo = new LibroDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json");
		
		response.getWriter().append(repo.getAll().toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("titolo")!= null) {
			String titolo = request.getParameter("titolo");
			
			repo.addLibro(titolo, 1+ Math.random()*10);
			
		}
		
		doGet(request, response);
	}

}
