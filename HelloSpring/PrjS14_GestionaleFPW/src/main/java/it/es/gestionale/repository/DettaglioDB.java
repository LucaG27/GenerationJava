package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.DettaglioEntity;
import it.es.gestionale.model.DettaglioKey;

@Repository
public interface DettaglioDB extends JpaRepository<DettaglioEntity, DettaglioKey>{
	
	@Query(value="select * from ordine_dettaglio where ordine_id=?1", nativeQuery=true)
    List<DettaglioEntity> getDettagliByOrdine(int id);
}

