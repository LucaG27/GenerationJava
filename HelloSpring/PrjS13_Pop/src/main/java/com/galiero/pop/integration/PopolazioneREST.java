package com.galiero.pop.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galiero.pop.entities.Provincia;
import com.galiero.pop.service.PopolazioneService;

@RestController
@RequestMapping({"api"})
public class PopolazioneREST {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("regioni")
	//@ResponseBody
	public List<String> getRegioni(Model m) {
		return service.getRegioni();
	}
	
	
	@PostMapping("regioni/{regione}")
	public List<Provincia> getProvinceByRegione(@PathVariable String regione) {
		return service.getProvinceByRegione(regione);
	}
	
	@PostMapping("regioni/comuni/{comune}")
	public Provincia getComune(@PathVariable String comune) {
		
		return service.getProvinciaByComune(comune);
	}
	
	@GetMapping("eta")
	//@ResponseBody
	public String getEta(Model m) {
		m.addAttribute("titolo", "Seleziona una fascia di età");
		return "eta";
	}
}