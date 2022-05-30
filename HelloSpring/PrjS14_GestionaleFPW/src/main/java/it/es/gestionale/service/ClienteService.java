package it.es.gestionale.service;

import java.util.List;
import it.es.gestionale.model.ClienteEntity;

public interface ClienteService {

	List<ClienteEntity> getListaClienti();

	//	List<String> getListaClientiString();

	ClienteEntity getClienteByid(int id);

	void saveCliente(ClienteEntity newCliente);

	List<ClienteEntity> getFilterByNome(String nome);

	List<ClienteEntity> getFilterByCognome(String cognome);

	List<ClienteEntity> getFilterByTelefono(String telefono);

	List<ClienteEntity> getFilterByEmail(String email);

	void deleteCliente(int id);
}
