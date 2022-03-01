package it.jaita52_esercizi;

import java.util.Scanner;

public class task_1 {

	public static void main(String[] args) {
		//Scrivere una classe Java che chiede (tramite lo standard input - Scanner) 
		//ripetutamente all'utente di inserire stringhe e che termina quando l'utente 
		//inserisce la stringa vuota. Al termine dell'inserimento delle stringhe, 
		//la classe deve stampare sullo standard output la lunghezza media delle stringhe inserite.

        Scanner scansiona = new Scanner(System.in);
        String input = "";
        int contatore = 0;
        int lunghezzaTotale = 0;
        
        while (true) {
            System.out.print("Ciao! inserisci una stringa: ");
            input = scansiona.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;

            } else {
            	contatore++;
            	lunghezzaTotale = lunghezzaTotale + input.length();
            	
                System.out.println("Per fermare il programma inserire una stringa vuota");
            }
        }             	System.out.println("La lunghezza media delle stringhe inserite e': "+lunghezzaTotale/contatore);
    }
	
}
