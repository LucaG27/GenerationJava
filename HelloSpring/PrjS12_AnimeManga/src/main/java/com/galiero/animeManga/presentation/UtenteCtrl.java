package com.galiero.animeManga.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.galiero.animeManga.model.Utente;
import com.galiero.animeManga.service.UtenteService;

@Controller
@RequestMapping("/login")
@SessionAttributes
public class UtenteCtrl {

	@Autowired
	UtenteService srv;

	@GetMapping
	public String getUt(Model model) {

		String benv = "Inserire le credenziali.";

		model.addAttribute("formUtente", new Utente());

		model.addAttribute("benv", benv);

		return "login";

	}

	@PostMapping("/login-utente") 
	public String loginUtente(@ModelAttribute Utente utenteForm, Model model, HttpSession session) {

		System.out.println("utente form: " + utenteForm); // vedi consolese

		try {		
			Utente utente = srv.login(utenteForm); // restituisce utente se esiste, altrim lancia eccezione

			session.setAttribute("utente", utente); // aggiungo l'istanza dell'utente loggato alla sessione

			return "redirect:/am/anime-manga";			
			//return redirect consente di richiamare una rotta mappata all'interno di un controller
			//In questo caso chiediamo di dirigerci nella get mappata sotto lista-prodotti

		} catch(Exception e) {

			model.addAttribute("errore", e.getMessage());
			return getUt(model);
		}
	}

	@GetMapping("/logout") //N.B: url è  "/login/logout"
	public String logout(HttpSession session) {

		session.invalidate(); // resetta la sessione e gli oggetti associati

		return "redirect:/pagina-utente";
	}
}
