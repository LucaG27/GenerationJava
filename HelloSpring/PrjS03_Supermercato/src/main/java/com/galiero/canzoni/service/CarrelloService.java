package com.galiero.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.canzoni.model.Prodotto;
import com.galiero.canzoni.model.Utente;
import com.galiero.canzoni.repository.ProdottiDb;
import com.galiero.canzoni.repository.UtentiDb;

@Service
public class CarrelloService {

	@Autowired
	UtentiDb dbUtenti;
	@Autowired
	ProdottiDb dbProdotti;

	public List<Prodotto> getCarrello(int id) {

		return dbUtenti.getById(id).getCarrello();
	}

	public String addCarrello(int idUtente, int idProdotto) {

		Prodotto p = dbProdotti.getById(idProdotto);
		List<Prodotto> carrello = getCarrello(idUtente);
		carrello.add(p);
		
		//getCarrello(idUtente).add(dbProdotti.getById(idProdotto));

		return "prodotto aggiunto correttamente al carrello";
	}
	
	public String remProdotto(int idUtente, int idProdotto) {

		Prodotto p = dbProdotti.getById(idProdotto);
		List<Prodotto> carrello = getCarrello(idUtente);
		carrello.remove(p);
		
		//getCarrello(idUtente).add(dbProdotti.getById(idProdotto));

		return "Prodotto rimosso con successo";
	}
}
