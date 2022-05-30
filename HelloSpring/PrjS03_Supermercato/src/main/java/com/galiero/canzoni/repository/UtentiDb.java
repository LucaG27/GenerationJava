package com.galiero.canzoni.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.galiero.canzoni.model.Utente;

@Repository
public class UtentiDb {
	
	List<Utente> lista;
	
	public UtentiDb() {
		lista = new ArrayList(
					Arrays.asList(
					new Utente(1, "Marco", "Rossi", "via rossi", "m.rossi@gmail.com", "marcorossi"),
					new Utente(2, "Giuseppe", "Verdi", "via verdi", "g.verdi@gmail.com", "giuseppeverdi"),
					new Utente(3, "Carlo", "Bianchi", "via bianchi", "c.bianchi@gmail.com", "carlobianchi")
		));
	}
	
	public List<Utente> getAll(){
		return lista;
	}
	
	
	public Utente getById(int id) {
		for(Utente c:lista) {
			if(id==c.getId()) return c;
		}
		return null;
	}
	
	public void saveById(Utente c) {
		Utente vecchia = getById(c.getId());
		lista.remove(vecchia);
		lista.add(c);
	}
	
	public void deleteById(int id) {
		
		lista.remove(getById(id));
	}
}
