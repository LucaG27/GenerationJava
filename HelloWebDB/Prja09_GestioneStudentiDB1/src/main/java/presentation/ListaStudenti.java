package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Studente;
import repository.Database;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import controller.StudenteCTRL;

@WebServlet("/listaStudenti")
public class ListaStudenti extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudenteCTRL ctrl;

	public ListaStudenti() throws ClassNotFoundException, SQLException {
		super();
		ctrl = StudenteCTRL.getCTRL();
	}

	// Solitamente usato per richiedere dati al server
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Studente> listaStudenti = ctrl.getAllStudente();
			request.setAttribute("listaStudenti", listaStudenti); // Permette di mappare sotto la chiave "lista" il
																	// valore della variabile lista
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("Message", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

	// Solitamente usato per aggiornare dati sul server
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Studente> listaStudenti = ctrl.getAllStudente();
			request.setAttribute("listaStudenti", listaStudenti); // Permette di mappare sotto la chiave "lista" il
																	// valore della variabile lista
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("Message", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

	// Solitamente usato per inserire dati sul server
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Studente> listaStudenti = ctrl.getAllStudente();
			request.setAttribute("listaStudenti", listaStudenti); // Permette di mappare sotto la chiave "lista" il
																	// valore della variabile lista
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("Message", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

	// Solitamente usato per cancellare dati suò server
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idDaCancellare =Integer.parseInt( request.getParameter("deleteId"));
            int nRecordCancellati=ctrl.deleteStudente(idDaCancellare);
            if(nRecordCancellati ==1)
			request.setAttribute("avvisoMessaggio", "Studente cancellato con successo"); // Permette di mappare sotto la chiave "lista" il
            else
            	request.setAttribute("avvisoMessaggio", "Anomalia, cancellati "+nRecordCancellati);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("Message", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}