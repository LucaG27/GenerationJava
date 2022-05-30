package com.galiero.supermercato.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.supermercato.model.Prodotto;

@Repository
public interface ProdottiDB extends JpaRepository <Prodotto, Integer> {
	
	List<Prodotto> findByNomeAndReparto(String nome, String reparto);
	
	List<Prodotto> findByNome(String nome);
	
}
