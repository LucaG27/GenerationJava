package dal;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database instance;

	private List<PersonaDAO> listaPersone;

	private Database() {
		listaPersone = new ArrayList<>();
		listaPersone.add(new PersonaDAO("Giuseppe", "Verdi", "g.verdi@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Marco", "Rossi", "m.rossi@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Luca", "bianchi", "l.bianchi@gmail.com", "123456"));

	}

	public static Database getDatabase() {
		if (instance == null) {
			instance = new Database();

		}
		return instance;
	}

	public List<PersonaDAO> getPersone() {
		return this.listaPersone;
	}
}
