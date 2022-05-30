package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.ArticoloEntity;
import it.es.gestionale.model.ImpiegatoEntity;

@Repository
public interface ImpiegatoDB extends JpaRepository<ImpiegatoEntity, Integer>{

	@Query(value= "select * from impiegato where stipendio between ?1 and ?2",nativeQuery=true)
	List<ImpiegatoEntity> findByStipendio(double s1, double s2);
	
	List<ImpiegatoEntity> findByNomeContainsIgnoreCase(String nome);
	
	List<ImpiegatoEntity> findByCognomeContainsIgnoreCase(String cognome);
	
	List<ImpiegatoEntity> findByRuoloContainsIgnoreCase(String ruolo);

}

