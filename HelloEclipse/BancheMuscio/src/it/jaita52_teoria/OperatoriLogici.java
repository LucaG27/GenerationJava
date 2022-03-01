package it.jaita52_teoria;

public class OperatoriLogici {

	public static void main(String[] args) {
		// AND &
		// OR    ||
		// NOT      !
		// si usano per scrivere le condizioni per valorizzare
		// dei boolean oppure per cicli e IF
		
		int p1eta=58;
		String p1citta="Torino";
		//si utilizza !p1citta per NOT
		if(p1eta<20 && p1citta.equals("Torino")) { //per le stringhe non si utilizza == ma .equals(" ")
			System.out.println("SI");
       	}else {
       		System.out.println("NO");		
	}
		int esempio2eta=25;
		int esempio2etaLimite=25;
		if(esempio2eta!=esempio2etaLimite) { //!= o = per gli interi
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		//Operatore Ternario int risultato = (condizione ? valore_vero : valore_falso
		
		int saldoBanca= 1000;
				int sogliaRicchezza=1000000;
		String statoCliente=(saldoBanca>=sogliaRicchezza ? "Ricco" : "Normale");
		System.out.println(statoCliente);
		
		//Se usassimo l'IF
		String statoCliente2;
		if(saldoBanca>=sogliaRicchezza) {
			statoCliente2="Ricco";
		}else {
			statoCliente2="Normale";
		}
		System.out.println(statoCliente);
		
}
}
