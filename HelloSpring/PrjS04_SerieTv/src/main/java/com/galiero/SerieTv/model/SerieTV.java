package com.galiero.SerieTv.model;


public class SerieTV {

	private int id;
	private String nome;
	private String genere;
	private String descrizione;
	private String foto;

	public SerieTV(int id, String nome, String genere, String descrizione, String foto) {
		this.id = id;
		this.nome = nome;
		this.genere = genere;
		this.descrizione = descrizione;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
