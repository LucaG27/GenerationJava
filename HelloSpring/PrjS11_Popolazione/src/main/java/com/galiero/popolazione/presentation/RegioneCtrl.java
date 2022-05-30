package com.galiero.popolazione.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.galiero.popolazione.model.Regione;
import com.galiero.popolazione.service.RegioneService;


	@Controller
	@RequestMapping("/regioni")
	@SessionAttributes("regione")
	public class RegioneCtrl {
		
		@Autowired
		RegioneService srv;
		
		@GetMapping("/lista-regioni")
		public String getRegioni(Model model) {
			
			model.addAttribute("regioni", srv.getListaRegioni());

			return "vista-regioni";
		}
		
		@GetMapping("/seleziona-regioni")
		public String getRegioniRicerca(Model model) {
			
			model.addAttribute("regioni", srv.getListaRegioni());

			return "vista-regioni";
		}
		
		
		@GetMapping("/ricerca-regione")
		public ModelAndView ricercaRegione(ModelMap model, @RequestParam String regione, @RequestParam String comune) {
			
			Regione in = srv.getComune(regione, comune);
		try {
			model.addAttribute("percSuRegione", srv.getPercentualeOnRegione(in));
			model.addAttribute("percSuItalia", srv.getPercentualeOnItalia(in));
			model.addAttribute("percPerMaschi", srv.getPercentualeMaschi(in));
			model.addAttribute("percPerFemmine", srv.getPercentualeFemmine(in));
		} catch (Exception e) {
			model.addAttribute("errore", "Errore, qualcosa è andato storto: " + e.getMessage() + "!" );
		}
			return new ModelAndView("redirect:/html-da-definire", model) ;
		}
}
