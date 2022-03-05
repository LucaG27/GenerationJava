package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Autore;
import model.AutoreLibro;
import model.Libro;


public class Database {

	private static Database instance;

	private Connection con;

	private final static String DB_URL = "jdbc:mysql://localhost:3306/generation";
	private final static String DB_USER = "app_generation";
	private final static String DB_PASSWORD = "generation_2022";
	private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

	private Database() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}

	public static Database getDatabase() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

/*>--------------------------------------------------------INSERT-LIBRO--------------------------------------------------------<*/
	
	public boolean insertLibro(Libro lib) throws SQLException{
		String sql="INSERT INTO generation.libro "
				+ " (id, titolo, prezzo, pagine) "
				+ " VALUES(?, ?, ?, ?) ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setInt(1, lib.getId());
		istruzione.setString(2, lib.getTitolo());
		istruzione.setDouble(3, lib.getPrezzo());
		istruzione.setInt(4, lib.getPagine());
			
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		int numRigheModificate=istruzione.executeUpdate();
		
		if(numRigheModificate==1) return true;
		
		return false;
	}
	
/*>--------------------------------------------------------UPDATE-LIBRO--------------------------------------------------------<*/
	
	public int updateLibro(Libro lib) throws SQLException{
		String sql="UPDATE generation.libro "
				+ " SET titolo=?, prezzo=?, pagine=? "
				+ " WHERE id=? ; ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setString(1, lib.getTitolo());
		istruzione.setDouble(2, lib.getPrezzo());
		istruzione.setInt(3, lib.getPagine());
		istruzione.setInt(4, lib.getId());
	
		return istruzione.executeUpdate();
	}
	
	
/*>--------------------------------------------------------GETbyID-LIBRO--------------------------------------------------------<*/

	public Libro getLibroById(int id) throws SQLException{
		String sql="SELECT id, titolo, prezzo, pagine "
				+ " FROM generation.libro "
				+ " WHERE id=? ;";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		istruzione.setInt(1, id);
		
		ResultSet risultatiQuery = istruzione.executeQuery();
	while(risultatiQuery.next()) {
		Libro lib = new Libro();
		
		lib.setId(risultatiQuery.getInt("id"));
		lib.setTitolo(risultatiQuery.getString("titolo"));
		lib.setPrezzo(risultatiQuery.getDouble("prezzo"));
		lib.setPagine(risultatiQuery.getInt("pagine"));
			
		return lib;
		}
	return null;
	}
	
	/*>--------------------------------------------------------GETaLL-LIBRI--------------------------------------------------------<*/

	public List<Libro> getAllLibri() throws SQLException {
		String sql = "SELECT id, titolo, prezzo, pagine " + " FROM generation.libro ";

		PreparedStatement istruzione = con.prepareStatement(sql);

		// executeQuery si usa per le SELECT
		ResultSet risultatiQuery = istruzione.executeQuery();

		// Monto una lista vuota di libri
		List<Libro> listaLibri = new ArrayList<>();

		while (risultatiQuery.next()) {
			// Per ogni record che arriva da DB istanzio uno studente
			Libro rstu = new Libro();
			// Ci imposto dentro le varie colonne della sua riga
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setTitolo(risultatiQuery.getString("titolo"));
			rstu.setPrezzo(risultatiQuery.getDouble("prezzo"));
			rstu.setPagine(risultatiQuery.getInt("pagine"));

			// Lo aggiungo alla lista dei libri
			listaLibri.add(rstu);
		}

		// Quando ho finito di leggere cosa mi è arrivato dal DB
		// ritorno al chiamante la lista dei libri
		return listaLibri;
	}
	
	/*>--------------------------------------------------------DELETE-LIBRO--------------------------------------------------------<*/
	
	public int deleteLibro(Libro lib) throws SQLException{
		String sql="DELETE FROM generation.libro WHERE id=? ; ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);		
		istruzione.setInt(1, lib.getId());
		
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		return istruzione.executeUpdate();
	}
	
	/*>--------------------------------------------------------INSERT-AUTORE--------------------------------------------------------<*/
	
	public boolean insertAutore(Autore aut) throws SQLException{
		String sql=" INSERT INTO generation.autore "
				+ " (id, nome, cognome, nazionalita) "
				+ " VALUES(?, ?, ?, ?) ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setInt(1, aut.getId());
		istruzione.setString(2, aut.getNome());
		istruzione.setString(3, aut.getCognome());
		istruzione.setString(4, aut.getNazionalita());
			
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		int numRigheModificate=istruzione.executeUpdate();
		
		if(numRigheModificate==1) return true;
		
		return false;
	}
	
	/*>--------------------------------------------------------UPDATE-AUTORE--------------------------------------------------------<*/
	
	public int updateAutore(Autore aut) throws SQLException{
		String sql="UPDATE generation.autore "
				+ " SET nome=?, cognome=?, nazionalita=? "
				+ " WHERE id=? ;";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setString(1, aut.getNome());
		istruzione.setString(2, aut.getCognome());
		istruzione.setString(3, aut.getNazionalita());
		istruzione.setInt(4, aut.getId());
			
		return istruzione.executeUpdate();
	}

	/*>--------------------------------------------------------GETaUTOREbyCOGNOME--------------------------------------------------------<*/

	public Autore getAutoreById(int id) throws SQLException{
		String sql="SELECT id, nome, cognome, nazionalita "
				+ " FROM generation.autore "
				+ " WHERE id=? ;";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		istruzione.setInt(1, id);
		
		ResultSet risultatiQuery = istruzione.executeQuery();
	while(risultatiQuery.next()) {
		Autore aut = new Autore();
		
		aut.setId(risultatiQuery.getInt("id"));
		aut.setNome(risultatiQuery.getString("nome"));
		aut.setCognome(risultatiQuery.getString("cognome"));
		aut.setNazionalita(risultatiQuery.getString("nazionalita"));
			
		return aut;
		}
	return null;
	}
	
	/*>--------------------------------------------------------GETaLL-AUTORI--------------------------------------------------------<*/
	
	public List<Autore> getAllAutori() throws SQLException {
		String sql = "SELECT id, nome, cognome, nazionalita " + " FROM generation.autore ";
		
		PreparedStatement istruzione = con.prepareStatement(sql);
		
		ResultSet risultatiQuery = istruzione.executeQuery();
		
		List<Autore> listaAutori = new ArrayList<>();
		
		while (risultatiQuery.next()) {
			
			Autore rstu = new Autore();
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setNome(risultatiQuery.getString("nome"));
			rstu.setCognome(risultatiQuery.getString("cognome"));
			rstu.setNazionalita(risultatiQuery.getString("nazionalita"));
			
			listaAutori.add(rstu);
		}
		
		return listaAutori;
	}
	
	/*>--------------------------------------------------------DELaUTORI--------------------------------------------------------<*/
	
	public int deleteAutore(Autore aut) throws SQLException {
		String sql = "DELETE FROM generation.autore" + " WHERE id = ? ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);		
		istruzione.setInt(1, aut.getId());
		
		return istruzione.executeUpdate();
	}
	
/*>--------------------------------------------------------INSERT-AUTORElIBRO--------------------------------------------------------<*/
	
	public boolean insertAutoreLibroId(AutoreLibro al) throws SQLException{
		String sql="INSERT INTO generation.autore_libro "
	+ " (autore_id, libro_id) "
	+ " VALUES(?,?) ; ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setInt(1, al.getAlAutoreId());
		istruzione.setInt(2, al.getAlLibroId());
	
		int numRigheModificate=istruzione.executeUpdate();
		
		if(numRigheModificate==1) return true;
		
		return false;
	}
	
	/*>--------------------------------------------------------GETaLL-AUTORI-IN-AUTORIlIBRI--------------------------------------------------------<*/
	
	public int getAutoriInAutoriLibri(int idAutore) throws SQLException {
		String sql = "SELECT count(*) as counter " + " FROM generation.autore_libro al" + " WHERE al.autore_id = ?";
		
		PreparedStatement istruzione = con.prepareStatement(sql);
		istruzione.setInt(1, idAutore);
		
		ResultSet risultatiQuery = istruzione.executeQuery();
		int counter = 0;
		while (risultatiQuery.next()) {
			counter = risultatiQuery.getInt("counter");
			
		}
		return counter;
	}
	

	/*>--------------------------------------------------------GETaLL-AUTORI-LIBRI--------------------------------------------------------<*/
	
	public List<AutoreLibro> getAllAutoriLibri() throws SQLException {
		String sql = " SELECT al.autore_id, al.libro_id, a.cognome, l.titolo, l.prezzo "
                + " FROM generation.autore_libro al" + " JOIN generation.autore a ON (a.id = al.autore_id) "
                + " JOIN generation.libro l ON (l.id = al.libro_id) " ;

		PreparedStatement istruzione = con.prepareStatement(sql);

		ResultSet risultatiQuery = istruzione.executeQuery();

		List<AutoreLibro> listaAutoreLibro = new ArrayList<>();

		while (risultatiQuery.next()) {

			AutoreLibro rstu = new AutoreLibro();
			rstu.setAlAutoreId(risultatiQuery.getInt("autore_id"));
			rstu.setAlLibroId(risultatiQuery.getInt("libro_id"));
			rstu.setaCognome(risultatiQuery.getString("cognome"));
			rstu.setlTitolo(risultatiQuery.getString("titolo"));
			rstu.setlPrezzo(risultatiQuery.getDouble("prezzo"));

			listaAutoreLibro.add(rstu);
		}

		return listaAutoreLibro;
	}

/*>--------------------------------------------------------DELETE-AUTORElIBRObyID--------------------------------------------------------<*/
	
	public int deleteAutoreLibro(AutoreLibro al) throws SQLException {
		String sql = "DELETE FROM generation.autore_libro al WHERE autore_id = ? ;";

		PreparedStatement istruzione= con.prepareStatement(sql);		
		istruzione.setInt(1, al.getAlAutoreId());
		
		return istruzione.executeUpdate();
	}
	
}
