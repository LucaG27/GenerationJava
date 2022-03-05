package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Autore;
import java.io.IOException;
import java.sql.SQLException;
import controller.AutoreController;

@WebServlet("/updAutore")
public class UpdAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreController controller;
	
	public UpdAutore() throws ClassNotFoundException, SQLException {
		controller=AutoreController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idDaModificare=Integer.parseInt(request.getParameter("modificaId"));
			
			Autore aut = controller.getAutoreById(idDaModificare);
			
			request.setAttribute("id", aut.getId());
			request.setAttribute("nome", aut.getNome());
			request.setAttribute("cognome", aut.getCognome());
			request.setAttribute("nazionalita", aut.getNazionalita());
	
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("uAutore.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		if(request.getParameter("id") != null)
			int id = Integer.parseInt(request.getParameter("id"));
			String nome=request.getParameter("nome");
			String cognome=request.getParameter("cognome");
			String nazionalita=request.getParameter("nazionalita");
			
		try {
			int nRigheAggiornate=controller.updateAutore(id, nome, cognome, nazionalita);
			
			if(nRigheAggiornate==1)
				request.setAttribute("avvisoMessaggio", "Autore aggiornato con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, aggiornati "+nRigheAggiornate+" records.");
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("listaAutori").forward(request, response);
	}

}
