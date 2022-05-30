package com.galiero.alimenti.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galiero.alimenti.entities.Alimento;
import com.galiero.alimenti.services.AlimentoService;

@RestController
@RequestMapping({"api","rest"}) // -> può essere chiamato sia da /api che da /rest
public class AlimentoREST {
	
	@Autowired
	private AlimentoService service;
	
	@GetMapping
	public List<Alimento> getAlimenti(){
		return service.getAlimenti();
	}
	
	@GetMapping("cat/{categoria}")
	public List<Alimento> getCategoria(@PathVariable("categoria") String cat){
		return service.getAlimentiByCategoria(cat);
	}
	
	@GetMapping("categorie")
	public List<String> getCategorie(){
		return service.getCategorie();
	}
	
	@PostMapping 
	public void addAlimento(@RequestBody Alimento a) {
		service.addAlimento(a);
	}
	
	@PutMapping
	public void updAlimento(@RequestBody Alimento a) {
		service.updAlimento(a);
	}
	@DeleteMapping("/{id}")
	public void delAlimento(@PathVariable int id) {
		service.delAlimento(id);
	}

}
