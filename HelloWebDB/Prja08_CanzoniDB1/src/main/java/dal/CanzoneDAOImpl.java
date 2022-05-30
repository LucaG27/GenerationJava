package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connection conn = null;
	private Statement stat = null;
	private ResultSet rs = null;

	private Connessione db = new Connessione();

	@Override
	public void addCanzone(Canzone c) throws SQLException {
		this.conn = db.connetti();
		this.stat = this.conn.createStatement();

		String query = "INSERT INTO canzonigen (titolo, cantante, genere, album) values( "

				+ "'" + c.getTitolo() + "', " + "'" + c.getCantante() + "', " + "'" + c.getGenere() + "', " + "'"
				+ c.getAlbum() + "')";

		this.stat.executeUpdate(query);
		System.out.println("Hai aggiunto la canzone " + c);

	}

	@Override
	public void updCanzone(Canzone c) {

	}

	@Override
	public void delCanzone(int id) {

	}

	@Override
	public Canzone getCanzone(int id) {
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {

		List<Canzone> canzoni = new ArrayList<>();

		this.conn = db.connetti();
		this.stat = this.conn.createStatement();

		this.rs = this.stat.executeQuery(GET_ALL);

		while (this.rs.next()) {
			
            int id = rs.getInt("id");
			String titolo = rs.getString("titolo");
			String album = rs.getString("album");
			String genere = rs.getString("genere");
			String cantante = rs.getString("cantante");

			Canzone c = new Canzone();
			c.setId(id);
			c.setTitolo(titolo);
			c.setAlbum(album);
			c.setCantante(cantante);
			c.setGenere(genere);
			
			canzoni.add(c);
		}

		return canzoni;
	}

}
