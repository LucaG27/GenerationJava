package it.es.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.repository.LoginDB;

@Service
public class LoginService {

	@Autowired
	LoginDB db;

	public LoginEntity findById(int id) {
		return db.findById(id).get();
	}

	public List<LoginEntity> getAllUtenti() {
		return db.findAll(); //Passacarte
	}

	public LoginEntity saveUtente(LoginEntity a){
		return db.save(a);
	}

	public void deleteUtente(int id) {
		db.delete(db.getById(id));
	}

	public LoginEntity getByid(int id) {
		return db.findById(id).orElse(new LoginEntity());
	}

	public LoginEntity findByEmailAndPassword(String email, String password) {
		return db.findByEmailAndPassword(email, password);
	}
}
