package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Database;
import model.SerieTv;

import java.io.IOException;
import java.util.List;

@WebServlet("/listaSerie")
public class ListaMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database db = Database.getDatabase();
		List<SerieTv> lista = db.getLista();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	
	}

}
