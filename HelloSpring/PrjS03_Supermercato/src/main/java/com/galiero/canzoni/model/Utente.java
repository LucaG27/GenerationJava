package com.galiero.canzoni.model;

import java.util.ArrayList;
import java.util.List;


public class Utente {

	private int Id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String email;
	private String password;
	private List<Prodotto> carrello;

	public Utente() {
	}

	public Utente(int id, String nome, String cognome, String indirizzo, String email, String password) {
		super();
		Id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.email = email;
		this.password = password;
		this.carrello = new ArrayList<>();
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Prodotto> getCarrello() {
		return carrello;
	}

	public void setCarrello(List<Prodotto> carrello) {
		this.carrello = carrello;
	}
	

}
