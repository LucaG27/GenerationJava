package it.jaita52_teoria;

public class Lampadina {
	
	      // CARATTERISTICHE OGGETTO
	private boolean accesa;
	private int calore;
	private boolean smart;
	private boolean RGB;
	
	     // COSTRUTTORE DEFINISCONO DEI COMPORTAMENTI DI DEFAULT DELL'OGGETTO
	     // QUINDI PER IL CAFFE' AD ESEMPIO I DIVERSI TIPI DI CAFFE' SERVONO PIU COSTRUTTORI
	     // LO RICONOSCI PERCHE' NON C'E' VOID NE PRIMITIVO
	
	public Lampadina() {} //COSTRUTTORE DEFAULT
	
	
	
	public Lampadina(int calore, boolean smart) { //COSTRUTTORE1
		
		this.calore = calore;
		this.smart = smart;
	}
	
	public Lampadina(boolean accesa) { //COSTRUTTORE2
		this.accesa = false;
		this.calore = 50;
		this.smart = true;
	}
	    // METODI MODIFICATORI PER IMPOSTARE I VALORI O PER RESTITUIRE UN VALORE
	
	// SERVE PER IMPOSTARE I VALORI
	public void accendi() {
		this.accesa = true;
	}
	
public void spegni() {
	this.accesa = false;
}
	// CI RESTITUISCE LO STATO
	public boolean isAccesa() {
		return accesa;
	}
	
	public int getCalore() {
		return calore;
	}
	
	public void setRGB(boolean RGB) {
		this.RGB = RGB;
		
	}
	
	public boolean isRGB() {
		return RGB;
	}
	}

