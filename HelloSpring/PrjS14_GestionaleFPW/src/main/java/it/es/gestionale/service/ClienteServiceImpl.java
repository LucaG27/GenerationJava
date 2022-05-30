package it.es.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.es.gestionale.model.ClienteEntity;
import it.es.gestionale.repository.ClienteDB;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteDB dbCli;

	public List<ClienteEntity> getListaClienti() {
		return dbCli.findAll();
	}

	//	public List<String> getListaClienti() {
	//
	//	 	return dbCli.getAllClienti();
	//	 	
	//	 }


	public ClienteEntity getClienteByid(int id){

		return dbCli.findById(id).get();
	}


	public void saveCliente(ClienteEntity newCliente) {

		dbCli.save(newCliente);
	}

	@Override
	public List<ClienteEntity> getFilterByNome(String nome) {
		return dbCli.findByNomeContainingIgnoreCase(nome);

	}

	@Override
	public List<ClienteEntity> getFilterByCognome(String cognome) {

		return dbCli.findByCognomeContainingIgnoreCase(cognome);
	}

	@Override
	public List<ClienteEntity> getFilterByTelefono(String telefono) {

		return dbCli.findByTelefonoContainingIgnoreCase(telefono);
	}

	@Override
	public List<ClienteEntity> getFilterByEmail(String email) {

		return dbCli.findByEmailContainingIgnoreCase(email);
	}

	@Override
	public void deleteCliente(int id) {

		dbCli.deleteById(id);
	}

	//	@Override
	//	public List<String> getListaClientiString() {
	//		return dbCli.getAllClienti();
	//	}

	//	 public EsempioModel saveEditore(EsempioModel e){
	//	 return dbEdi.save(e);
	//	 }
	//
	//	 public void deleteEditore(int id) {
	//		 dbEdi.delete(dbEdi.getById(id));
	//	 }
	//	
	//	 public EsempioModel getByid(int id) {
	//		 return dbEdi.findById(id).orElse(new EsempioModel());
	//	}
}
