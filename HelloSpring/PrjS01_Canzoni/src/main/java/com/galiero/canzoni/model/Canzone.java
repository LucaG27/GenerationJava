package com.galiero.canzoni.model;

public class Canzone {

	private int Id;
	private String titolo;
	private String autore;
	private String compositore;

	public Canzone() {
	}

	public Canzone(int id, String titolo, String autore, String compositore) {
		super();
		Id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.compositore = compositore;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCompositore() {
		return compositore;
	}

	public void setCompositore(String compositore) {
		this.compositore = compositore;
	}

	@Override
	public String toString() {
		return "Canzone [Id=" + Id + ", titolo=" + titolo + ", autore=" + autore + ", compositore=" + compositore + "]";
	}

}
