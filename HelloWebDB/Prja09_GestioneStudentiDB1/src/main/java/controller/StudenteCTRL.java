package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Studente;
import repository.Database;

public class StudenteCTRL {

	private static StudenteCTRL instance;
	private Database db;

	public StudenteCTRL() throws ClassNotFoundException, SQLException {

		db = Database.getDatabase();
	}

	public static StudenteCTRL getCTRL() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new StudenteCTRL();
		}
		return instance;
	}

	public boolean insertStudente(String nome, String cognome, String genere, String indirizzo, String citta,
			String provincia, String regione, String email, Date dataNascita) throws SQLException {

		Studente daInserire = new Studente();
		daInserire.setNome(nome);
		daInserire.setCognome(cognome);
		daInserire.setGenere(genere);
		daInserire.setIndirizzo(indirizzo);
		daInserire.setCitta(citta);
		daInserire.setProvincia(provincia);
		daInserire.setRegione(regione);
		daInserire.setEmail(email);
		daInserire.setDataNascita(dataNascita);

		return db.insertStudente(daInserire);

	}

	public int updateStudente(int id, String nome, String cognome, String genere, String indirizzo, String citta,
			String provincia, String regione, String email, Date dataNascita) throws SQLException {

		Studente daAggiornare = new Studente();
		daAggiornare.setNome(nome);
		daAggiornare.setCognome(cognome);
		daAggiornare.setGenere(genere);
		daAggiornare.setIndirizzo(indirizzo);
		daAggiornare.setCitta(citta);
		daAggiornare.setProvincia(provincia);
		daAggiornare.setRegione(regione);
		daAggiornare.setEmail(email);
		daAggiornare.setDataNascita(dataNascita);

		return db.updateStudente(daAggiornare);

	}

	public int deleteStudente(int id) throws SQLException {
		Studente daCancellare = new Studente();
		daCancellare.setId(id);

		return db.deleteStudente(daCancellare);

	}

	public Studente getStudenteById(int id) throws SQLException {
		return db.getStudenteById(id);

	}

	public List<Studente> getAllStudente() throws SQLException {
		return db.getAllStudente();

	}
}