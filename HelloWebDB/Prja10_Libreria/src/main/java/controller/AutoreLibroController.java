package controller;
 
import java.sql.SQLException;
import java.util.List;

import model.AutoreLibro;
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
 
/*>--------------------------------------------------------INSERT--------------------------------------------------------<*/
	
	public boolean insertAutoreLibroId(int alAutoreId, int alLibroId) throws SQLException {
		AutoreLibro daInserire = new AutoreLibro();
		
		daInserire.setAlAutoreId(alAutoreId);
		daInserire.setAlLibroId(alLibroId);
	
		
		return db.insertAutoreLibroId(daInserire);
	}
	
/*>--------------------------------------------------------DELETE--------------------------------------------------------<*/
	
	public int deleteAutoreLibro(int alAutoreId) throws SQLException{
		AutoreLibro daCancellare=new AutoreLibro();
		daCancellare.setAlAutoreId(alAutoreId);
		
		return db.deleteAutoreLibro(daCancellare);
	}
	
	/*>--------------------------------------------------------GETaLL--------------------------------------------------------<*/
	
	public List<AutoreLibro> getAllAutoriLibri() throws SQLException{
		return db.getAllAutoriLibri();
	}
}