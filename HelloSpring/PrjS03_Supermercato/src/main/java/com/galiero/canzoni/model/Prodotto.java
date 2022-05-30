package com.galiero.canzoni.model;

public class Prodotto {
	
	private int Id;
	private String nome;
	private String categoria;
	private double prezzo;
	
	public Prodotto(int id, String nome, String categoria, double prezzo) {
		super();
		Id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
