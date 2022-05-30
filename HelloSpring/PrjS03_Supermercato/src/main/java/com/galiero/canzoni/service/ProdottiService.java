package com.galiero.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.canzoni.model.Prodotto;
import com.galiero.canzoni.model.Utente;
import com.galiero.canzoni.repository.ProdottiDb;

@Service
public class ProdottiService {

	@Autowired
	ProdottiDb db;

	public List<Prodotto> getListaProdotti() {

		return db.getAll();
	}

}
