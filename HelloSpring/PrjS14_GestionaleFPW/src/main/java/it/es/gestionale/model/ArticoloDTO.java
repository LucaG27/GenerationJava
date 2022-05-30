package it.es.gestionale.model;

public class ArticoloDTO {

	private ArticoloEntity articolo;
	private int quantita;

	public ArticoloEntity getArticolo() {
		return articolo;
	}
	public void setArticolo(ArticoloEntity articolo) {
		this.articolo = articolo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public ArticoloDTO(ArticoloEntity articolo, int quantita) {
		super();
		this.articolo = articolo;
		this.quantita = quantita;
	}
}
