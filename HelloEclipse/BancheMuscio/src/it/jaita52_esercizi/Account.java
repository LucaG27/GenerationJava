package it.jaita52_esercizi;

public class Account {
	
	private double saldo;
	
	
	// Imposta il saldo a 0.00
	public Account() {
		
		saldo = 0.0;
	}
	// Deposito soldi
	
	public void versamento(double importo){
		saldo = saldo + importo;
	}
	// Prelievo soldi
	public void prelievo(double importo) {
		saldo = saldo - importo;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
