package it.es.gestionale.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import it.es.gestionale.model.UfficioEntity;
import it.es.gestionale.service.UfficioService;

@RestController
@RequestMapping("/api/ufficio")
@SessionAttributes("ufficio")
public class UfficioREST {

	@Autowired
	UfficioService srv;

	@GetMapping("/getAllUffici")
	public List<UfficioEntity> selectAll(){
		return srv.getAllUffici();
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
