package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Studente;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import controller.StudenteCTRL;

@WebServlet("/modificaStudente")
public class ModStudente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudenteCTRL ctrl;
	
	public ModStudente() throws ClassNotFoundException, SQLException {
		super();
		ctrl=StudenteCTRL.getCTRL();
	}

	//Solitamente usato per richiedere dati al server
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idDaModificare=Integer.parseInt(request.getParameter("modificaId"));
			Studente studente = ctrl.getStudenteById(idDaModificare);
			request.setAttribute("id", studente.getId());
			request.setAttribute("nome", studente.getNome());
			request.setAttribute("cognome", studente.getCognome());
			request.setAttribute("genere", studente.getGenere());
			request.setAttribute("indirizzo", studente.getIndirizzo());
			request.setAttribute("citta", studente.getCitta());
			request.setAttribute("provincia", studente.getProvincia());
			request.setAttribute("regione", studente.getRegione());
			request.setAttribute("email", studente.getEmail());
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("modStudente.jsp").forward(request, response);
	}
	
	//Solitamente usato per richiedere dati al server
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String nome=request.getParameter("nome");
			String cognome=request.getParameter("cognome");
			String genere=request.getParameter("genere");
			String indirizzo=request.getParameter("indirizzo");
			String citta=request.getParameter("citta");
			String provincia=request.getParameter("provincia");
			String regione=request.getParameter("regione");
			String email=request.getParameter("email");
			
			int nRigheAggiornate=ctrl.updateStudente(id, nome, cognome, genere, indirizzo, citta, provincia, regione, email, new Date(System.currentTimeMillis()));
			
			if(nRigheAggiornate==1)
				request.setAttribute("avvisoMessaggio", "Studente aggiornato con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, aggiornati "+nRigheAggiornate+" records.");
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("listaStudenti").forward(request, response);
	}

}