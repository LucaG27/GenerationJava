package esercizi_11_01;

public class Exercise6 {

	public static void main(String[] args) {


		//ESERCIZIO 1.6

		System.out.println("--- Inizio Esercizio 6 ---");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i; j < 6+i; j++) { 
				System.out.print(" "); 
			}
			for (int l = 7-i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}
		System.out.println("\n--- Fine Esercizio 6 ---\n");

	}
}

