package com.galiero.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.canzoni.model.Canzone;
import com.galiero.canzoni.repository.Database;

@Service
public class CanzoniService {
	
	@Autowired
	Database db;
	
	public List<Canzone> getAll() { //"Passacarte"
		return db.getAll();
	}
	
	public Canzone getOne(int id) { //"Passacarte"
		return db.getById(id);
	}
	
	public boolean salvaModifica(Canzone newCanzone, boolean isUpdate) {
		
		if(!isUpdate) db.addCanzone(newCanzone);
		else db.saveById(newCanzone);
		
		return true;
		
	}
	
	public boolean deleteCanzone(int id) {
		
		db.deleteById(id);
		return true;
	}

}
