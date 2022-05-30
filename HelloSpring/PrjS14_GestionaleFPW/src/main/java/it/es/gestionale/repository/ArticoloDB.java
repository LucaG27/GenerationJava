package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.ArticoloEntity;
import it.es.gestionale.model.OrdineEntity;
import it.es.gestionale.model.UfficioEntity;

@Repository
public interface ArticoloDB extends JpaRepository<ArticoloEntity, Integer>{

	@Query(value= "select * from articolo where prezzo between ?1 and ?2",nativeQuery=true)
	List<ArticoloEntity> findByPrezzo(double p1, double p2);
	
	List<ArticoloEntity> findByCategoriaContainsIgnoreCase(String categoria);

	List<ArticoloEntity> findByDescrizioneContainsIgnoreCase(String descrizione);
}

