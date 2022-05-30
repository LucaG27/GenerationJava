package it.es.gestionale.model;

public class OrdineDTO {

	private OrdineEntity ordine;

	private double tot;

	public OrdineDTO(OrdineEntity ordine, double tot) {
		super();
		this.ordine = ordine;
		this.tot = tot;
	}

	public OrdineEntity getOrdine() {
		return ordine;
	}

	public void setOrdine(OrdineEntity ordine) {
		this.ordine = ordine;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}
}
