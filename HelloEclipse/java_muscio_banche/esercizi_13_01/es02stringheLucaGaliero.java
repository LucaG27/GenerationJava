package esercizi_13_01;
import java.util.Scanner;
public class es02stringheLucaGaliero {
	public static void main(String[] args) {
		//Acquisire una stringa di caratteri, contenente pure degli spazi. 
		//Scrivere un procedimento tale che, ogni volta che viene trovato uno spazio, 
		//vengano soppressi eventuali altri spazi contigui (due o piu'). 
		//Ad esempio, se l'utente inserisce la stringa 
		//Oggi              è        una        ;    bella      giornata...   di         pioggia!!!
		//la stringa risultante sarà 
		//Oggi è una bella giornata... di pioggia!!!


		Scanner scan = new Scanner(System.in);

		System.out.print("Inserire stringa:");

		String stringa = scan.nextLine();
		stringa.trim();
				
		for(int i = 0; i < stringa.length(); i++) {
				if(stringa.charAt(i) != ' ' || stringa.charAt(i+1) != ' ') {
				
				System.out.print(stringa.charAt(i));

			
		}
		}
	}
}










