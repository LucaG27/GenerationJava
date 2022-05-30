package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

import controller.CanzoniCTRL;
@WebServlet("/canzoni")
public class CanzoniMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CanzoniCTRL ctrl;
       
    public CanzoniMVC() {
    	ctrl = new CanzoniCTRL();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("cantante")!=null) {
			String cantante = request.getParameter("cantante");
			request.setAttribute("listaCanzoni", this.ctrl.getCanzoni()
					.stream()
					.filter(c->c.getCantante().startsWith(cantante))
					.collect(Collectors.toList())
							);
		}else {
			
			request.setAttribute("listaCanzoni", this.ctrl.getCanzoni());
		}
	
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("titolo")!= null) {
			String titolo = request.getParameter("titolo");
			String genere = request.getParameter("genere");
			String album = request.getParameter("album");
			String cantante = request.getParameter("cantante");
			this.ctrl.addCanzone(titolo, cantante, genere, album);
			
			System.out.println("Ho aggiunto la canzone");
		}
		doGet(request, response);
	}

}
