package it.es.gestionale.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import it.es.gestionale.model.ImpiegatoEntity;
import it.es.gestionale.service.ImpiegatoService;

@RestController
@RequestMapping("/api/impiegato")
@SessionAttributes("impiegato")
public class ImpiegatoREST {

	@Autowired
	ImpiegatoService srv;

	@GetMapping("/update/{id}")
	public ResponseEntity<ImpiegatoEntity> preloadUpdate(@PathVariable("id") int id) {
		return new ResponseEntity<ImpiegatoEntity> (srv.findById(id), HttpStatus.OK);
	}

	@PostMapping("/insert")
	public ResponseEntity<ImpiegatoEntity> insertOrUpdateArticolo(@RequestBody ImpiegatoEntity imp) {
		return new ResponseEntity<ImpiegatoEntity> (srv.saveImpiegato(imp), HttpStatus.OK);
	}

	@GetMapping("/allImpiegati")
	public List<ImpiegatoEntity> selectAll(){

		List<ImpiegatoEntity> list = srv.getAllImpiegati();

		for(ImpiegatoEntity i : srv.getAllImpiegati()) System.out.println(i.getUfficio().getId());

		return srv.getAllImpiegati();
	}

	@GetMapping("/forNome/{nome}")
	public List<ImpiegatoEntity> selectNome(@PathVariable("nome") String nome){
		return srv.getImpiegatiByNome(nome);
	}

	@GetMapping("/forCognome/{cognome}")
	public List<ImpiegatoEntity> selectCognome(@PathVariable("cognome") String cognome){
		return srv.getImpiegatiByNome(cognome);
	}

	@GetMapping("/forStipendio/{s1}/{s2}")
	public List<ImpiegatoEntity> selectStipendio(@PathVariable("s1") double s1, @PathVariable("s2") double s2){
		return srv.getImpiegatiByStipendio(s1, s2);
	}

	@GetMapping("/forRuolo/{ruolo}")
	public List<ImpiegatoEntity> selectRuolo(@PathVariable("ruolo") String ruolo){
		return srv.getImpiegatiByRuolo(ruolo);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteImpiegato(@PathVariable("id") int id) {
		srv.deleteImpiegato(id);
	}

	//	@PostMapping("/saveCanzone")
	//	public String salvaModifica (@RequestParam(value = "isUpdate", required = true) boolean isUpdate, 
	//								 @RequestBody Utente newCanzone
	//			){
	//		
	//		
	//		if(srv.salvaModifica(newCanzone, isUpdate)) return "Salvataggio effettuato";
	//		else return "Errore nel passaggio della richiesta";
	//
	//		
	//	}
	//	
	//	@DeleteMapping("/deleteCanzone")
	//	public String deleteCanzone (@RequestParam(value = "id", required = true) int id) {
	//		
	//		if(srv.deleteCanzone(id)) return "Cancellazione effettuata";
	//		else return "Errore durante la cancellazione";
	//		
	//	}
	//	
	//	public Utente getCanzone (@PathVariable(value = "id") int id) {
	//		
	//	return srv.getOne(id);
	//	}
}
