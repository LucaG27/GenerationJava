package controller;
 
import java.sql.SQLException;
import java.util.List;
 
import model.AutoreLibro;
import model.Libro;
import repository.Database;
 
public class AutoreLibroController {
 
	private static AutoreLibroController instance;
 
	private Database db;
 
	public AutoreLibroController() throws ClassNotFoundException, SQLException {
		db = Database.getDatabase();
	}
 
	public static AutoreLibroController getController() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new AutoreLibroController();
		}
		return instance;
	}	
	
	public boolean insertAutoreLibroId(int alAutoreId, int alLibroId) throws SQLException {
		AutoreLibro daInserire=new AutoreLibro();
		
		daInserire.setAlAutoreId(alAutoreId);
		daInserire.setAlLibroId(alLibroId);
		
		return db.insertAutoreLibroId(daInserire);
	}
	
	public int deleteAutoreLibro(int alLibroId) throws SQLException {
		AutoreLibro daCancellare = new AutoreLibro();
		daCancellare.setAlLibroId(alLibroId);
		return db.deleteAutoreLibro(daCancellare);
	}
	
 
	public List<AutoreLibro> getAllAutoriLibri() throws SQLException{
		return db.getAllAutoriLibri();
	}
}