package com.galiero.animeManga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.animeManga.model.Utente;
import com.galiero.animeManga.repository.UtenteDB;

@Service
public class UtenteService {

	@Autowired
	UtenteDB db;
	
	public Utente login(Utente ut) throws Exception {
		
		List<Utente> listaUt = db.findAll(); // -> fa in automatico la query per tirare dati dalla tabella utente
		
		for (Utente utente : listaUt) {
			
			if(utente.getEmail().equals(ut.getEmail())) { //Esiste un utente con quella password?
				
				if(utente.getPassword().equals(ut.getPassword())) { //Se esiste, la password inserita è corretta?
					
					return utente;
					
				}
			}
			
		}
		
		throw new Exception("Credenziali errate.");
		
	}
	
	public void registraUtente(Utente input) {
		db.save(input); 
	}
}
