package com.galiero.SerieTv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.SerieTv.model.SerieTV;
import com.galiero.SerieTv.repository.Database;

@Service
public class SerieTvService {

	@Autowired
	Database db;

	public List<SerieTV> getALL() {

		return db.getLista();
	}

	public SerieTV getOne(int id) {

		return db.getById(id);
	}
	
	public boolean saveSerie(SerieTV newSerieTv){
		
		db.saveById(newSerieTv);
		return true;
		
	}
	
	public boolean deleteSerie(int id) {
		
		db.deleteById(id);
		return true;
	}

}
