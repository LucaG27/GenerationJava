package model;

import java.util.ArrayList;
import java.util.List;

public class SerieTv {
	
	private int id;
	private String nome;
	private String genere;
	private String descrizione;
	private List<String> cast;
	private String foto;
	

	public SerieTv(int id, String nome, String genere, String descrizione, String foto) {
		
		this.id = id;
		
		this.nome = nome;
		
		this.genere = genere;
		
		this.descrizione = descrizione;
		
		this.foto = foto;
		
		this.cast = new ArrayList<String>();
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

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
