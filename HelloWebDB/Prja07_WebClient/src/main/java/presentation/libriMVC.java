package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.LibroDAO;
import dal.LibroIDAO;

@WebServlet("/libri")
public class libriMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private LibroIDAO repo;

    public libriMVC() {
    	repo = new LibroDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
