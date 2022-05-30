package it.es.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.es.gestionale.model.ImpiegatoEntity;
import it.es.gestionale.repository.ImpiegatoDB;

@Service
public class ImpiegatoService {

	@Autowired
	ImpiegatoDB db;

	public ImpiegatoEntity findById(int id) {
		return db.findById(id).get();
	}

	public List<ImpiegatoEntity> getAllImpiegati() {
		return db.findAll(); //Passacarte
	}

	public ImpiegatoEntity saveImpiegato(ImpiegatoEntity a){
		return db.save(a);
	}

	public void deleteImpiegato(int id) {
		db.delete(db.getById(id));
	}

	public ImpiegatoEntity getByid(int id) {
		return db.findById(id).orElse(new ImpiegatoEntity());
	}

	public List<ImpiegatoEntity> getImpiegatiByNome(String nome) {
		return db.findByNomeContainsIgnoreCase(nome); //Passacarte
	}

	public List<ImpiegatoEntity> getImpiegatiByCognome(String cognome) {
		return db.findByCognomeContainsIgnoreCase(cognome); //Passacarte
	}

	public List<ImpiegatoEntity> getImpiegatiByRuolo(String ruolo) {
		return db.findByRuoloContainsIgnoreCase(ruolo); //Passacarte
	}

	public List<ImpiegatoEntity> getImpiegatiByStipendio(double s1, double s2) {
		return db.findByStipendio(s1, s2); //Passacarte
	}
}
