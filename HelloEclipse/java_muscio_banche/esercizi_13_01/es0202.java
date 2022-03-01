package esercizi_13_01;

import java.util.Scanner;

public class es0202 {

		public static void main(String[] args) {
			// Scrivi un programma in linguaggio Java che legga da tastiera una frase e una parola,
			// queste devono essere passate ad un metodo 
			// che restituisce il numero di occorrenze della parola nella frase.
			
			
			
			
			
			
			
			Scanner scan = new Scanner(System.in);
			long parole;
			
			
			
			
			for(int i = 1; i > 0; i++) {
				
				System.out.print("Inserire stringa:");
				String stringa = scan.nextLine();
			
			parole = stringa.chars().filter(ch -> ch != ' ').count();
			
			//String risultato = parole.replaceAll("  ", " ");

				System.out.println(parole);// + " " + parole + " " + parole);
			}
			
			

	}
}