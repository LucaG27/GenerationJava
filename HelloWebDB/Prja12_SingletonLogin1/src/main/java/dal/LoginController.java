package dal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Database db = Database.getDatabase();
		List<PersonaDAO> ListaPersone = db.getPersone();

		// CERCO NELL'ARRAY DI PERSONE CHI HA USER E PASS COME QUELLE INSERITE
		// DALL'UTENTE
		for (PersonaDAO persona : ListaPersone) {
			if (persona.getEmail().equals(email)) {
				if (persona.getPassword().equals(password)) {
					if (persona.isLogin()) {

						// PERSONA GIA AUTENTICATA

					} else {
						persona.setLogin(true);
						request.getSession().setAttribute("email", persona.getEmail());;
						request.setAttribute("nome", persona.getNome());
						request.setAttribute("cognome", persona.getCognome());
						request.getRequestDispatcher("profilo.jsp").forward(request, response);
					}
				} else {

				}
			}

		}

	}
}
