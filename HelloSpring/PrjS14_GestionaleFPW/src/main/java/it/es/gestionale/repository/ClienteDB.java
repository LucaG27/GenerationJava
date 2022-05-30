package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.ClienteEntity;


@Repository
public interface ClienteDB extends JpaRepository<ClienteEntity, Integer>{
	
	
	
//	@Query(value="SELECT id, cognome, nome, telefono, email, indirizzo, citta, provincia, regione, IFNULL(credito, 0) credito\r\n"
//			+ "FROM cliente;", nativeQuery=true)
//	List<String> getAllClienti();
	
	List<ClienteEntity> findByNomeContainingIgnoreCase(String nome);
	List<ClienteEntity> findByCognomeContainingIgnoreCase(String cognome);
	List<ClienteEntity> findByTelefonoContainingIgnoreCase(String telefono);
	List<ClienteEntity> findByEmailContainingIgnoreCase(String email);
}