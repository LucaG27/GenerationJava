package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import controller.AutoreController;

@WebServlet("/aggiungiAutore")
public class AddAutore extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AutoreController controller;

    public AddAutore() throws ClassNotFoundException, SQLException {
        controller = new AutoreController();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("aAutore.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        if (request.getParameter("id") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            String cognome = request.getParameter("cognome");
            String nazionalita = request.getParameter("nazionalita");

            try {
                this.controller.insertAutore(id, nome, cognome, nazionalita);
            } catch (SQLException e) {
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.getRequestDispatcher("listaAutori").forward(request, response);
        }
    }
}
