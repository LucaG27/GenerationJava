package model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseLogin {

	private static DatabaseLogin instance;
	private List<PersonaDAO> listaPersone;

	private DatabaseLogin() {
		listaPersone = new ArrayList<>();
		listaPersone.add(new PersonaDAO("Giuseppe", "Verdi", "g.verdi@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Paperino", "Paperino", "paperino@gmail.com", "123456"));
		listaPersone.add(new PersonaDAO("Topo", "Lino", "topolino@gmail.com", "123456"));
	}

	public static DatabaseLogin getDatabase() {
		if (instance == null) {
			instance = new DatabaseLogin();
		}
		return instance;
	}

	public List<PersonaDAO> getPersone() {
		return listaPersone;
	}

}
