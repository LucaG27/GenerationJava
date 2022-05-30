package com.galiero.supermercato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.supermercato.model.Carrello;

@Repository
public interface CarrelloDB extends JpaRepository <Carrello, Integer> {
	
}
