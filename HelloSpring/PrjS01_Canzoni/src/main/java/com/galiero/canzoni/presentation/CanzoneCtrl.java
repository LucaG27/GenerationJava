package com.galiero.canzoni.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.galiero.canzoni.model.Canzone;
import com.galiero.canzoni.repository.Database;
import com.galiero.canzoni.service.CanzoniService;

@Controller
@RequestMapping("/canzoni")
public class CanzoneCtrl {
	
	@Autowired 
	CanzoniService srv;
	
	@GetMapping
	public String getAll(Model m) {
		
		String titolo = "Le mie canzoni preferite";
		m.addAttribute("titolo", titolo);
		
		m.addAttribute("canzoni", srv.getAll()); 
	 
		m.addAttribute("newCanzone", new Canzone());
		
		m.addAttribute("isUpdate", false);
		
		return "elenco"; 
	}
	
	@GetMapping("/prova")
	public String getAll2() {
		
		return "prova";
	}
	
	@PostMapping("/editCanzone")
	public String sceltaCanzone(Model model, @RequestParam(value="idDaModificare", required=true) int action) { 
	
		Canzone daModificare = srv.getOne(action);
		model.addAttribute("newCanzone", daModificare);
		model.addAttribute("isUpdate", true);
		return "elenco";
	}
	
	@PostMapping("/saveCanzone") 
	public String salvaCanzone(@ModelAttribute Canzone newCanzone, @RequestParam(value="isUpdate", required=true) boolean isUpdate, Model model) { 

		
		srv.salvaModifica(newCanzone, isUpdate);
		
		return getAll(model);
	}
}
