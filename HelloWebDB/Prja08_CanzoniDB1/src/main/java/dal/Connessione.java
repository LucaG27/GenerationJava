package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final static String DB_URL = "jdbc:mysql://localhost:3306/generation?";
	private final static String USER = "app_generation";
	private final static String PASS = "generation_2022";
	// private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

	private Connection conn = null;

	public Connection connetti() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		if (this.conn == null) {
			try {
				this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Siamo connessi");
			} catch (SQLException e) {
				System.err.println("Errore di Connessione");
				System.err.println(e.getMessage());
				// e.printStackTrace();
			}
		}

		return conn;
	}
}
