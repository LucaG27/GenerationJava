package it.es.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.es.gestionale.model.UfficioEntity;
import it.es.gestionale.repository.UfficioDB;

@Service
public class UfficioService {

	@Autowired
	UfficioDB db;

	public UfficioEntity findById(int id) {
		return db.findById(id).get();
	}

	public List<UfficioEntity> getAllUffici() {
		return db.findAll(); //Passacarte
	}
}
