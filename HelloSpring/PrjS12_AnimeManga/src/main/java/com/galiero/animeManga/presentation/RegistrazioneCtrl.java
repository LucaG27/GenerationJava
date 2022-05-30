package com.galiero.animeManga.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galiero.animeManga.model.Utente;
import com.galiero.animeManga.service.UtenteService;

@Controller
@RequestMapping("/registrazione")
public class RegistrazioneCtrl {
	
	@Autowired 
	UtenteService srv;
	
	@GetMapping
	public String get(Model model) {
		
		String titolo = "Inserisci i dati per la registrazione";
		
		model.addAttribute("formUtente", new Utente());
		//Siccome useremo un oggetto per il controllo, dobbiamo istanziarlo di principio
		model.addAttribute("titolo", titolo);
		
		return "registrazione"; 
	}
	
	
	@PostMapping("/registra-utente") 
	public String registraUtente(@ModelAttribute Utente utenteForm, Model model, HttpSession session) {
		
		System.out.println("utente form: " + utenteForm); // vedi consolese
		
		try {		
			srv.registraUtente(utenteForm); // restituisce utente se esiste, altrim lancia eccezione
			
			return "redirect:/login";			
			//return redirect consente di richiamare una rotta mappata all'interno di un controller
			//In questo caso chiediamo di dirigerci nella get mappata sotto lista-prodotti
			
		} catch(Exception e) {
			model.addAttribute("errore", e.getMessage());
			return get(model);
		}
	}
}
