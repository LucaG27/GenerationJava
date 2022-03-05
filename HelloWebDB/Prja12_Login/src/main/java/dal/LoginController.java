package dal;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonaDAO;

@WebServlet("/api/login")
public class LoginController extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		Database db = Database.getDatabase();
		List<PersonaDAO> listaPersone = db.getPersone();
		//CERCO NELL'ARRAY DI PERSONE
		for(PersonaDAO persona : listaPersone) {
			if(persona.getEmail().equals(email))
				if(persona.getPassword().equals(password))
					if(persona.isLogin()) {
						//PERSONA GIA' AUTENTICATA
						
					} else {
						persona.setLogin(true);
						req.getSession().setAttribute("email", persona.getEmail());
						req.setAttribute("nome", persona.getNome());
						req.setAttribute("cognome", persona.getCognome());
						req.getRequestDispatcher("Profilo.jsp").forward(req, res);

					}else {
						//PASSWORD ERRATA
					}
		}
	}
}
