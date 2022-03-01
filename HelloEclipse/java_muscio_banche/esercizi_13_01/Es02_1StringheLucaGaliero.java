package esercizi_13_01;

import java.util.Scanner;

public class Es02_1StringheLucaGaliero {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

	System.out.print("Inserire stringa:");

	String stringa = scan.nextLine();
	stringa.trim();
	
	
	for(int i = 0; i < stringa.length(); i++) {
		stringa.trim();
			if(stringa.charAt(i) != ' ' || stringa.charAt(i+1) != ' ') {
			
			System.out.print(stringa.charAt(i));

		}else if (stringa.charAt(i) == ' ');
			
			
	}
}
}