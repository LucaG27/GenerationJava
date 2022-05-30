package com.galiero.services;

import java.util.List;

import com.galiero.entities.Alimento;

public interface AlimentoService {		//ruolo di servizio - passacarte - cameriere

	//CRUD
	
	void addAlimento(Alimento a);
	void updAlimento(Alimento a);
	void delAlimento(int id);
	
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	Alimento getAlimentoById(int id);
	List<String> getCategorie();
}
