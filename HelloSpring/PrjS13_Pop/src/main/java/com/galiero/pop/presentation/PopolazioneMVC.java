package com.galiero.pop.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.galiero.pop.entities.Provincia;
import com.galiero.pop.service.PopolazioneService;

@Controller
@RequestMapping("")
public class PopolazioneMVC {

	@Autowired
	private PopolazioneService service;
	
	
	@GetMapping
	public String home() {
		
		return "index";
	}
	
	
	
	@GetMapping("regioni")
	//@ResponseBody
	public String getRegioni(Model m) {
		
		m.addAttribute("titolo", "Seleziona una regione");
		m.addAttribute("elenco", service.getRegioni());
		return "regioni";
	}
	
	@GetMapping("eta")
	//@ResponseBody
	public String getEta(Model m) {
		m.addAttribute("titolo", "Seleziona una fascia di età");
		return "eta";
	}
	
	@PostMapping("regioni")
	public String getProvinceByRegione(@RequestParam("elencoRegioni")String regione, Model m) {
		
		List<Provincia> provinceByRegione = service.getProvinceByRegione(regione);
		m.addAttribute("province", provinceByRegione);
		m.addAttribute("titolo", regione);
		return "province";
	}
	
	@PostMapping("comuni")
	public String getComuneByRegione(@RequestParam("elencoComuni")String comune, Model m) {
		
		Provincia provincia = service.getProvinciaByComune(comune);
		m.addAttribute("provincia", provincia);
		m.addAttribute("titolo", provincia.getComune());
		return "comune";
	}
}
