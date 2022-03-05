package dal;

import java.util.List;

import model.Libro;

public interface LibroIDAO {
	
	//crud
	//Implicitamente public e abstract
	//Create
	
	void addLibro(String titolo, double prezzo);
	//Read Retrieve
	List<Libro> getAll();
	
	Libro getLibroById(int id);
	//Update
	void updLibro (Libro l);
	//Delete
	void delLibro(int id);

}
