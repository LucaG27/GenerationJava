package it.es.gestionale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.es.gestionale.model.OrdineEntity;

@Repository
public interface OrdineDB extends JpaRepository<OrdineEntity, Integer>{
	
	@Query(value="select ordine.id, cliente_id, impiegato_id, data, consegna, sum(quantita*prezzo) somma "
            + "from ordine, ordine_dettaglio, articolo "
            + "where ordine.id=ordine_dettaglio.ordine_id AND articolo.id=ordine_dettaglio.articolo_id "
            + "group by ordine.id; ", nativeQuery=true)
    List<OrdineEntity> getOrdini();

	@Query(value="select * from ordine where impiegato_id = ?1", nativeQuery = true)
	List<OrdineEntity> findByImpiegato(int id);

	@Query(value="select * from ordine where cliente_id = ?1", nativeQuery = true)
	List<OrdineEntity> findByCliente(int id);
}



