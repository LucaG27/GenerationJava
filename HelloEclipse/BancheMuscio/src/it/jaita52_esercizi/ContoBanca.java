package it.jaita52_esercizi;

public class ContoBanca {

	public String nomeCliente;
	private double saldo;

	// COSTRUTTORE
	public ContoBanca(String nomeCliente, double saldo){
      this.nomeCliente = nomeCliente;
      this.saldo = saldo;
	}
      
      
 	 // METODO MODIFICATORE #1
	public void versamento(double importo){
		
		saldo = saldo + importo;
	}

	       
	 // METODO MODIFICATORE #2
	public void prelievo(double importo) {
	
	saldo = saldo - importo;
	    
	
	}
}