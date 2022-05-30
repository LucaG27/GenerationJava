package com.galiero.canzoni.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.galiero.canzoni.model.Prodotto;
import com.galiero.canzoni.model.Utente;

@Repository
public class ProdottiDb {
	
	List<Prodotto> lista;
	
	public ProdottiDb() {
		lista = new ArrayList(
					Arrays.asList(
							new Prodotto(1, "pera", "frutta", 1.25),
							new Prodotto(2, "matita", "cartoleria", 2.50),
							new Prodotto(3, "pasta", "alimentari", 1.45),
							new Prodotto(4, "mela", "frutta", 0.85)
				
		));
	}
	
	public List<Prodotto> getAll(){
		return lista;
	}
	
	
	public Prodotto getById(int id) {
		for(Prodotto c:lista) {
			if(id==c.getId()) return c;
		}
		return null;
	}
	
	public void saveById(Prodotto c) {
		Prodotto vecchia = getById(c.getId());
		lista.remove(vecchia);
		lista.add(c);
	}
	
	public void deleteById(int id) {
		
		lista.remove(getById(id));
	}
}
