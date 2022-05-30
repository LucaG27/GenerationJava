package com.galiero.pop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="popolazione_italiana_eta")
public class Eta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eta_numerica")
	private int etaNumerica;
	
	private String eta;
	private int maschi; 
	private int femmine; 
	private int totale;
	
	public Eta() {}

	public Eta(int etaNumerica, String eta, int maschi, int femmine, int totale) {
		super();
		this.etaNumerica = etaNumerica;
		this.eta = eta;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}

	public int getEtaNumerica() {
		return etaNumerica;
	}

	public void setEtaNumerica(int etaNumerica) {
		this.etaNumerica = etaNumerica;
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
}
