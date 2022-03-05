package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.UtenteBannatoException;
import model.Persona;
import model.Prodotto;

public class Database {

	private static Database instance;
	private Map<String, List<Prodotto>> listaSpesa;
	private List<Persona> listaPersone;
	private List<String> listaEmailBannate;

	private Database() {
		listaSpesa = new HashMap<>();

		List<Prodotto> spesaDiLuca = new ArrayList<Prodotto>();
		spesaDiLuca.add(new Prodotto(0, "Banana", 1.00, "Frutta"));
		spesaDiLuca.add(new Prodotto(1, "Biscotti", 2.00, "Dolci"));
		spesaDiLuca.add(new Prodotto(2, "Carota", 0.70, "Verdura"));
		listaSpesa.put("g.verdi@gmail.com", spesaDiLuca);

		listaPersone = new ArrayList<>();
		listaPersone.add(new Persona("Giuseppe", "Verdi", "g.verdi@gmail.com", "123456"));
		listaPersone.add(new Persona("Marco", "Rossi", "m.rossi@gmail.com", "123456"));
		listaPersone.add(new Persona("Luca", "bianchi", "l.bianchi@gmail.com", "123456"));
		
		listaEmailBannate = new ArrayList<>();
		listaEmailBannate.add("m.rossi@gmail.com");
		
		
		

	}

	public static Database getDatabase() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public List<Prodotto> getListaSpesa(String email) throws UtenteBannatoException {
		if(listaEmailBannate.contains(email)){
			throw new UtenteBannatoException(email);
		}
		
		if (listaSpesa.get(email) == null) {
			List<Prodotto> listaSpesaVuota = new ArrayList<Prodotto>();
			listaSpesa.put(email, listaSpesaVuota);
		}
		return listaSpesa.get(email);
	}

	public List<Persona> getListaPersone() {
		return listaPersone;

	}
}