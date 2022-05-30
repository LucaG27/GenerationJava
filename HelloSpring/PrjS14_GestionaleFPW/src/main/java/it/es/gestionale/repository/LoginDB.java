package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.ArticoloEntity;
import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.model.OrdineEntity;
import it.es.gestionale.model.UfficioEntity;

@Repository
public interface LoginDB extends JpaRepository<LoginEntity, Integer>{

	@Query(value= "select * from login where email = ?1 and password = ?2",nativeQuery=true)
	LoginEntity findByEmailAndPassword(String email, String password);
	
}

