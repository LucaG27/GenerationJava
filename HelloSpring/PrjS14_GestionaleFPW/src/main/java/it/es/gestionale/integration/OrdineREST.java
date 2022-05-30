package it.es.gestionale.integration;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.es.gestionale.model.ArticoloDTO;
import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.model.OrdineDTO;
import it.es.gestionale.model.OrdineEntity;
import it.es.gestionale.service.OrdineService;

@RestController
@RequestMapping("/api/ordini")
public class OrdineREST {

	@Autowired
	OrdineService srv;
	
//	
//	@PostMapping("/insert")
//	public ResponseEntity<ArticoloEntity> insertOrUpdateArticolo(@RequestBody ArticoloEntity articolo) {
//		return new ResponseEntity<ArticoloEntity> (srv.saveArticolo(articolo), HttpStatus.OK);
//	}
	
	@GetMapping("/getOrdine/{id}")
	public ResponseEntity<OrdineEntity> getOrdineById(@PathVariable("id") int id){
		return new ResponseEntity<OrdineEntity>(srv.getOrdineById(id), HttpStatus.OK);
	}
//	
	@GetMapping("/allOrdini")
	public List<OrdineDTO> selectAllOrdini(){
		List<OrdineDTO> list = srv.getOrdini();
		return srv.getOrdini();
	}
	
	@GetMapping("/allOrdiniCliente")
	public List<OrdineDTO> selectAllOrdiniCliente(HttpSession session){
		LoginEntity utente = (LoginEntity) session.getAttribute("utenteLoggato");
		return srv.getOrdiniByCliente(utente.getCliente().getId());
	}
	
	@GetMapping("/allOrdiniImpiegato")
	public List<OrdineDTO> selectAllOrdiniImpiegato(HttpSession session){
		LoginEntity utente = (LoginEntity) session.getAttribute("utenteLoggato");
		List<OrdineDTO> list = srv.getOrdiniByImpiegato(utente.getImpiegato().getId());
		return srv.getOrdiniByImpiegato(utente.getImpiegato().getId());
	}
	
	@PostMapping("/viewProdotti")
	public List<ArticoloDTO> viewProdotti(@RequestBody OrdineEntity ordine, HttpSession session){
		LoginEntity utente = (LoginEntity) session.getAttribute("utenteLoggato");	
		return srv.getProdottiByOrdine(ordine.getId());
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
//	
	
	
	
}
