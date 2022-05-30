package it.es.gestionale.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.service.ClienteService;

@Controller
@RequestMapping("/clienti")
public class ClienteCtrl {

	@Autowired
	ClienteService srv;

	@GetMapping
	public String getListaClienti(Model model, HttpSession session) {

		if(session.getAttribute("utenteLoggato") == null) return "redirect:/login-page";

		model.addAttribute("clienti", srv.getListaClienti());

		LoginEntity logEnt = (LoginEntity) session.getAttribute("utenteLoggato");


		if(logEnt.getRuolo().equals("cliente")) return "profilo_utente";
		if(logEnt.getRuolo().equals("impiegato")) return "clienti";

		return "clienti";
	}
}
