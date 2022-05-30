package com.galiero.alimenti.services;

import java.util.List;

import com.galiero.alimenti.entities.Alimento;

public interface AlimentoService {
	
	void addAlimento(Alimento a);
	void updAlimento(Alimento a);
	void delAlimento(int id);
	
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	Alimento getAlimentiById(int id);
	List<String> getCategorie();
}
