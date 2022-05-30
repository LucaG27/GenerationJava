package com.delprete.supermercato;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.galiero.supermercato.model.Carrello;
import com.galiero.supermercato.model.Prodotto;
import com.galiero.supermercato.model.Utente;
import com.galiero.supermercato.repository.CarrelloDB;
import com.galiero.supermercato.repository.ProdottiDB;
import com.galiero.supermercato.repository.UtentiDB;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class CarrelloTest {
	
	@Autowired
	CarrelloDB db;
	@Autowired
	UtentiDB uDB;
	@Autowired
	ProdottiDB pDB;
	
	@Test
	void findAllUtente() {
		db.deleteAll();
		Utente ut = uDB.findAll().get(0);
		Prodotto p = pDB.findAll().get(0);
		Carrello c = db.save(new Carrello(ut,p));
		Carrello c0 = db.findAll().get(0);
		Utente u0 = c0.getUtente();
		assertNotNull (db.findAll().get(0));
	}
	
	@Test
	void findAll() {
		List<Carrello> list = db.findAll();
	}
	
	@Test
	void findCarrello() {
		
		
		
	}
}
