package esercizi_13_01;

import java.util.Scanner;

public class es01lucagaliero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double numCar = 0;
		double numCar2 = 0;
		double numStringhe = 0;

		for (double i = 1; i != 0; i = numCar) {
			System.out.print("Inserire stringa:");
			String stringa = scan.nextLine();
			numCar = stringa.length();
			numStringhe++;
			numCar2= numCar2 + numCar;
		}
		double media = numCar2 / (numStringhe -1); //-1 per eliminare dal totale la stringa vuota
	
		System.out.print("La media dei caratteri per stringa è: " + media);
	}
}

