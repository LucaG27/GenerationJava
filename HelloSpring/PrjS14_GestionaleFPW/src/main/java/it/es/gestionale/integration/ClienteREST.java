package it.es.gestionale.integration;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.es.gestionale.model.ClienteEntity;
import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.service.ClienteService;

@RestController
@RequestMapping({"api/cliente", "rest/cliente"})
public class ClienteREST {

	@Autowired
	ClienteService srv;

	@GetMapping("/getClienteById/{id}")
	public ClienteEntity findCliente(@PathVariable(value="id") int id) {

		return srv.getClienteByid(id);

	}

	@GetMapping("/getProfiloCliente/")
	public ClienteEntity findProfiloCliente(HttpSession session) {
		LoginEntity logEnt = (LoginEntity) session.getAttribute("utenteLoggato");

		return findCliente(logEnt.getId());

	}


	@PostMapping("/saveCliente")
	public String createCliente(@RequestBody ClienteEntity newCliente){

		try {
			srv.saveCliente(newCliente);
			return "Cliente: " + newCliente.getCognome() + ", salvato correttamente";
		} catch (Exception e) {
			return "ERRORE! Cliente: " + newCliente.getCognome() + ", NON salvato! Qualcosa è andato storto: " + e.getMessage();
		}

	}


	@DeleteMapping("/deleteCliente/{id}")
	public String deleteCanzone (@PathVariable(value="id") int id) {


		try {
			String cognome = findCliente(id).getCognome();
			srv.deleteCliente(id);
			return "Cancellazione del Cliente: " + cognome + ", con ID: " + id + ", effettuata";
		} catch (Exception e) {
			return "Errore! Cancellazione del Cliente con ID: " + id + ", NON effetuata! Qualcosa è andato storto: " + e.getMessage();

		}

	}

	@GetMapping("/clienteFilterBy/{categoria}/{filtro}")
	public List<ClienteEntity> clienteFilterBy(@PathVariable("categoria") String categoria, @PathVariable("filtro") String filtro) {

		List<ClienteEntity> ls = new ArrayList<>();

		switch (categoria) {
		case "nome":
			ls = srv.getFilterByNome(filtro);
			break;

		case "cognome":
			ls = srv.getFilterByCognome(filtro);
			break;

		case "telefono":
			ls=srv.getFilterByTelefono(filtro);
			break;

		case "email":
			ls = srv.getFilterByEmail(filtro);
			break;

		}

		return ls;

	}

	//	@GetMapping("/{id}")
	//	public ResponseEntity<ClienteEntity> findEditore(@PathVariable("id") int id) {
	//		
	//		try {
	//			Editore x = srv.getByid(id);
	//			return ResponseEntity.ok(x);
	//		}catch (Exception e) {
	//			return ResponseEntity.ok(new Editore());
	//		}
	//	}
}
