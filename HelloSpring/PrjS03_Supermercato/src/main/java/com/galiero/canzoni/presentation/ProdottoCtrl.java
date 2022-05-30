package com.galiero.canzoni.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.galiero.canzoni.model.Utente;
import com.galiero.canzoni.service.ProdottiService;
import com.galiero.canzoni.service.UtentiService;

@Controller
@RequestMapping("/listaProdotti")
@SessionAttributes("utente")
public class ProdottoCtrl {

	@Autowired
	ProdottiService srv; // Autowired consente a Spring di capire se trattare un oggetto come un
							// transient o un singleton

	@GetMapping
	public String get(Utente utente, Model model) {
		if(utente.getEmail()==null) {
			return "redirect:/login";
		}
		// "utente" viene caricato automaticamente dalla sessione
		// se non loggato, crea un utente con costruttore vuoto (attributi sono null, id=0)

		String titolo = "Elenco dei prodotti";

		model.addAttribute("titolo", titolo);
		model.addAttribute("prodotti", srv.getListaProdotti());
		// Passiamo la lista mediante il "passacarte" del service
		
		System.out.println("utente loggato: " + utente);  // vedi console

		return "elencoProdotti";
	}

}
