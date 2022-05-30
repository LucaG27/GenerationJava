package com.galiero.canzoni.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.galiero.canzoni.model.Utente;

@Controller
@RequestMapping("/carrello")
@SessionAttributes("utente")
public class CarrelloCtrl {

	
	@GetMapping
	public String getCarrello(Utente ut, Model model) {
		if(ut.getEmail()==null) {
			return "redirect:/login";
		}
		return "carrello";
	}
}
