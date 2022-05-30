package com.galiero.animeManga.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.galiero.animeManga.model.Utente;
import com.galiero.animeManga.service.AnimeMangaService;

@Controller
@RequestMapping("/am")
@SessionAttributes("utente")
public class AnimeMangaCtrl {

	@Autowired
	AnimeMangaService srv;
	
	@GetMapping("/anime-manga")
	public String getAllAM(Model model) {
	
		model.addAttribute("animeManga", srv.getListaAM());
		
		return "anime-manga";

		
	}
	
	@GetMapping
	public String get(Utente utente, Model model) {
		// "utente" viene caricato automaticamente dalla sessione
		// se non loggato, crea un utente con costruttore vuoto (attributi sono null, id=0)
		if (utente.getEmail()==null) {
			return "redirect:/login";
		}
		String titolo = "Elenco degli Anime Manga";

		model.addAttribute("titolo", titolo);
		model.addAttribute("animeManga", srv.getListaAM());
		// Passiamo la lista mediante il "passacarte" del service
		
		System.out.println("utente loggato: " + utente);  // vedi console

		return "anime-manga";
	}
}
