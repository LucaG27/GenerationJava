package it.es.gestionale.integration;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginREST {

	@Autowired
	LoginService srv;

	@PostMapping("/validation")
	public ResponseEntity<LoginEntity> validation(@RequestBody LoginEntity loginTry, HttpSession session){

		LoginEntity l = srv.findByEmailAndPassword(loginTry.getEmail(), loginTry.getPassword());

		if(l != null) {
			session.setAttribute("utenteLoggato", l);
			return new ResponseEntity<LoginEntity>(l, HttpStatus.OK);
		} else return ResponseEntity.badRequest().build();

	}

	@GetMapping("/control")
	public ResponseEntity<LoginEntity> control(HttpSession session){
		return new ResponseEntity<LoginEntity>((LoginEntity) session.getAttribute("utenteLoggato"), HttpStatus.OK);
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
