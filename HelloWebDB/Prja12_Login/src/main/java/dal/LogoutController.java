package dal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.PersonaDAO;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = (String) request.getSession().getAttribute("email");
		Database db = Database.getDatabase();
		for(model.PersonaDAO p : db.getPersone()) {
			if(p.getEmail().equals(email) && p.isLogin());
			p.setLogin(false);
			request.getSession().setAttribute(email, null);
			}
		request.getRequestDispatcher("login.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
