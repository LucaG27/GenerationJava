package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import controller.StudenteController;

@WebServlet("/aggiungiStudente")
public class AggiungiStudente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudenteController ctrl;

	public AggiungiStudente() throws ClassNotFoundException, SQLException {
		ctrl = new StudenteController();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getParameter("nome") != null) {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String genere = request.getParameter("genere");
			String indirizzo = request.getParameter("indirizzo");
			String citta = request.getParameter("citta");
			String provincia = request.getParameter("provincia");
			String regione = request.getParameter("regione");
			String email = request.getParameter("email");
			String dataNascita = request.getParameter("dataNascita");
			
				try {
					this.ctrl.insertStudente(nome, cognome, genere, indirizzo, citta, provincia, regione, email, Date.valueOf(dataNascita));
				} catch (SQLException e) {
					e.printStackTrace();
					request.setAttribute("errorMessage", e.getMessage()); //con il .getSession mantieni il valore di setAttribute in tutte le pagine
				}
				request.getRequestDispatcher("listaStudenti").forward(request, response);
			}

		}
}