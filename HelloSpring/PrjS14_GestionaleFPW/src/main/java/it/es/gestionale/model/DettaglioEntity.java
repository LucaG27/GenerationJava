package it.es.gestionale.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ordine_dettaglio")
public class DettaglioEntity {

	@EmbeddedId
	DettaglioKey id;

	@ManyToOne
	@MapsId("articoloId")
	@JoinColumn(name = "articolo_id")
	@JsonIgnore
	private ArticoloEntity articolo;

	@ManyToOne
	@MapsId("ordineId")
	@JoinColumn(name = "ordine_id")
	@JsonIgnore
	private OrdineEntity ordine;

	private int quantita;

	public DettaglioEntity() {
		super();
	}

	public DettaglioKey getId() {
		return id;
	}

	public void setId(DettaglioKey id) {
		this.id = id;
	}

	public ArticoloEntity getArticolo() {
		return articolo;
	}

	public void setArticolo(ArticoloEntity articolo) {
		this.articolo = articolo;
	}

	public OrdineEntity getOrdine() {
		return ordine;
	}

	public void setOrdine(OrdineEntity ordine) {
		this.ordine = ordine;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	@Override
	public String toString() {
		return "DettaglioEntity [id=" + id + ", articolo=" + articolo + ", ordine=" + ordine + ", quantita=" + quantita
				+ "]";
	}
}
