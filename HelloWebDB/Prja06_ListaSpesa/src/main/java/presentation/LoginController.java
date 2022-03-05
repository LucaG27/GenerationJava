package presentation;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DatabaseLogin;
import model.PersonaDAO;

@WebServlet ("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		DatabaseLogin db = DatabaseLogin.getDatabase();
		List<PersonaDAO> listaPersone = db.getPersone();
		for (PersonaDAO persona : listaPersone) {
			if (persona.getEmail().equals(email)) {
				if (persona.getPassword().equals(password)) {
					if (persona.isLogin()) {
						
					} else {
						persona.setLogin(true);
						req.getSession().setAttribute("email", persona.getEmail());
						req.setAttribute("nome", persona.getNome());
						req.setAttribute("cognome", persona.getCognome());
						req.getRequestDispatcher("/profilo.jsp").forward(req, res);
					}
				}
			}
		}
	}
}