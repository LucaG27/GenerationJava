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

import com.galiero.popolazione.service.EtaService;


	@Controller
	@RequestMapping("/eta")
	@SessionAttributes("etaEntity")
	public class EtaCtrl {
		
		@Autowired
		EtaService srv;
		
		@GetMapping("/lista-eta")
		public String getRegioni(Model model) {
			model.addAttribute("regioni", srv.getListaEta());

			return "html-da-inserire-eta";
		}
		
		
		@GetMapping("/ricerca-regione")
		public ModelAndView ricercaRegione(ModelMap model, @RequestParam int eta1, @RequestParam int eta2) {
			
		try {
			
			if(eta1>eta2) {
				model.addAttribute("errore", "Errore, qualcosa è andato storto: !" );
				return new ModelAndView("redirect:/html-da-inserire-eta", model) ;
			}
			model.addAttribute("listaEta", srv.getEtaIntervall(eta1, eta2));
//			model.addAttribute("maschiPerc", srv.getPercentualeMaschi(eta1, eta2));
//			model.addAttribute("femminePerc", srv.getPercentualeFemmine(eta1, eta2));
			
			
//			model.addAttribute("percSuRegione", srv.getPercentualeOnRegione(in));
//			model.addAttribute("percSuItalia", srv.getPercentualeOnItalia(in));
//			model.addAttribute("percPerMaschi", srv.getPercentualeMaschi(in));
//			model.addAttribute("percPerFemmine", srv.getPercentualeFemmine(in));
		} catch (Exception e) {
			model.addAttribute("errore", "Errore, qualcosa è andato storto: " + e.getMessage() + "!" );
		}
			return new ModelAndView("redirect:/html-da-definire", model) ;
		}
}
