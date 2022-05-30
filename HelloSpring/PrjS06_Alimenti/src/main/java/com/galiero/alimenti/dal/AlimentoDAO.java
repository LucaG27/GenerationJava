package com.galiero.alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.alimenti.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {
	
	List<Alimento> findByCategoria(String categoria);
	//List<String> findDistinctByCategoria();

}
