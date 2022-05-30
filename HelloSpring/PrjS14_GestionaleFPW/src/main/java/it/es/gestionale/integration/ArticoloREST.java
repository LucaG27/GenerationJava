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
import org.springframework.web.multipart.MultipartFile;

import it.es.gestionale.model.ArticoloEntity;
import it.es.gestionale.service.ArticoloService;

@RestController
@RequestMapping("/api/articolo")
public class ArticoloREST {

	@Autowired
	ArticoloService srv;

	@PostMapping("/import")
	public void importArticolo(@RequestBody MultipartFile file) {
		srv.importCsv(file);
	}

	@GetMapping("/update/{id}")
	public ResponseEntity<ArticoloEntity> preloadUpdate(@PathVariable("id") int id) {
		return new ResponseEntity<ArticoloEntity> (srv.findById(id), HttpStatus.OK);
	}

	@PostMapping("/insert")
	public ResponseEntity<ArticoloEntity> insertOrUpdateArticolo(@RequestBody ArticoloEntity articolo) {
		return new ResponseEntity<ArticoloEntity> (srv.saveArticolo(articolo), HttpStatus.OK);
	}

	@GetMapping("/allArticoli")
	public List<ArticoloEntity> selectAll(){
		return srv.getAllArticoli();
	}

	@GetMapping("/forDesc/{descrizione}")
	public List<ArticoloEntity> selectDescrizione(@PathVariable("descrizione") String descrizione){
		return srv.getArticoliByDescrizione(descrizione);
	}

	@GetMapping("/forPrezzo/{p1}/{p2}")
	public List<ArticoloEntity> selectPrezzo(@PathVariable("p1") double p1, @PathVariable("p2") double p2){
		return srv.getArticoliByPrezzo(p1, p2);
	}

	@GetMapping("/forCat/{categoria}")
	public List<ArticoloEntity> selectCategoria(@PathVariable("categoria") String categoria){
		return srv.getArticoliByCategoria(categoria);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteArticolo(@PathVariable("id") int id) {
		srv.deleteArticolo(id);
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
