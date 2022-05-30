package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Piatto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/piatti")
public class PiattiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PiattiCtrl ctrl;
	
    public PiattiMVC() {
        super();
        this.ctrl = new PiattiCtrl();
        System.out.println("Ho creato la servlet e inizializzato il controller dei piatti");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("regione")!= null) {
			List <Piatto> piatti = new ArrayList<>(); //contenitore vuoto
			for(Piatto p : this.ctrl.getPiatti()){
				if(p.getRegione().equals(request.getParameter("regione")))
					piatti.add(p);
			}
			request.setAttribute("elencoPiatti", piatti);
			
		} else {
			//aggiungo alla request l'attributo di nome elencoPiatti e con valore List<Piatto>
		request.setAttribute("elencoPiatti", this.ctrl.getPiatti());
		}

		
		//chiamo la pagina jsp e le passo la richiesta con il nuovo attributo appena inserito
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
		/*StringBuilder sb = new StringBuilder();
		
		List<Piatto> piatti = this.ctrl.getPiatti();
		
		for (Piatto piatto : piatti) {
			sb.append(piatto);
		}
		//risposta del server
		response.getWriter().append(sb.toString()); */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nomePiatto")!=null && request.getParameter("nomeRegione")!= null) {
		   String nome = request.getParameter("nomePiatto");
		   String regione = request.getParameter("nomeRegione");
		   this.ctrl.addPiatto(nome, regione);
		}
		   
		doGet(request, response);
	}

}
