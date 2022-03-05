package controller;

import java.sql.SQLException;
import java.util.List;

import model.Autore;
import repository.Database;

public class AutoreController {

	private static AutoreController instance;

	private Database db;

	public AutoreController() throws ClassNotFoundException, SQLException {
		db = Database.getDatabase();
	}

	public static AutoreController getController() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new AutoreController();
		}
		return instance;
	}

	/*>--------------------------------------------------------INSERT--------------------------------------------------------<*/
	
	public boolean insertAutore(int id, String nome, String cognome, String nazionalita) throws SQLException{
		Autore daInserire = new Autore();
		
		daInserire.setId(id);
		daInserire.setNome(nome);
		daInserire.setCognome(cognome);
		daInserire.setNazionalita(nazionalita);
	
		
		return db.insertAutore(daInserire);
	}
	
	/*>--------------------------------------------------------UPDATE--------------------------------------------------------<*/
	
	public int updateAutore(int id, String nome, String cognome, String nazionalita) throws SQLException{
		Autore daAggiornare = new Autore();
		
		daAggiornare.setId(id);
		daAggiornare.setNome(nome);
		daAggiornare.setCognome(cognome);
		daAggiornare.setNazionalita(nazionalita);
	
		
		return db.updateAutore(daAggiornare);
	}
	
	/*>--------------------------------------------------------DELETE--------------------------------------------------------<*/
	
	public int deleteAutore(int idAutore) throws SQLException{
		Autore daCancellare=new Autore();
		daCancellare.setId(idAutore);
		
		return db.deleteAutore(daCancellare);
	}
	
	/*>--------------------------------------------------------GETbyID--------------------------------------------------------<*/
	
	public Autore getAutoreById(int id) throws SQLException{
		return db.getAutoreById(id);
	}
	
	/*>--------------------------------------------------------GETallByID--------------------------------------------------------<*/
	
	public List<Autore> getAllAutori() throws SQLException{
		return db.getAllAutori();
	}
}