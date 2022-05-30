 package com.galiero.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.canzoni.model.Utente;
import com.galiero.canzoni.repository.UtentiDb;

@Service
public class UtentiService {

	@Autowired
	UtentiDb db;

	public Utente login(Utente ut) throws Exception {
		
		List<Utente> lista = db.getAll();
		
		for (Utente utente : lista) {
			
			if(utente.getEmail().equals(ut.getEmail())) { //Esiste un utente con quella password?
				
				if(utente.getPassword().equals(ut.getPassword())) { //Se esiste, la password inserita e' corretta
					
					return utente;
					
				}
			}
			
		}
		throw new Exception("Credenziali errate");
	}

}
