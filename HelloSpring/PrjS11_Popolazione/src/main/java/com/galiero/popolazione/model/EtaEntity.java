package com.galiero.popolazione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="popolazione_italiana_eta")
public class EtaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eta_numerica")
	private int id;
	
	private String eta;
	private int maschi;
	private int femmine;
	private int totale;
	
	
	public EtaEntity() {
		super();
	}


	public EtaEntity(int id, String eta, int maschi, int femmine, int totale) {
		super();
		this.id = id;
		this.eta = eta;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEta() {
		return eta;
	}


	public void setEta(String eta) {
		this.eta = eta;
	}


	public int getMaschi() {
		return maschi;
	}


	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}


	public int getFemmine() {
		return femmine;
	}


	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}


	public int getTotale() {
		return totale;
	}


	public void setTotale(int totale) {
		this.totale = totale;
	}


	@Override
	public String toString() {
		return "EtaEntity [id=" + id + ", eta=" + eta + ", maschi=" + maschi + ", femmine=" + femmine + ", totale="
				+ totale + "]";
	}

	
}