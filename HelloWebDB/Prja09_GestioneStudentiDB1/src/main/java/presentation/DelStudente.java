package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Studente;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import controller.StudenteCTRL;


@WebServlet("/cancellaStudente")
public class DelStudente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudenteCTRL ctrl;
	
	public DelStudente() throws ClassNotFoundException, SQLException {
		super();
		ctrl=StudenteCTRL.getCTRL();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idDaCancellare=Integer.parseInt(request.getParameter("deleteId"));
			int nRecordCancellati=ctrl.deleteStudente(idDaCancellare);
			if(nRecordCancellati==1)
				request.setAttribute("avvisoMessaggio", "Studente cancellato con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, cancellati "+nRecordCancellati+" records.");
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("listaStudenti").forward(request, response);
	}

}