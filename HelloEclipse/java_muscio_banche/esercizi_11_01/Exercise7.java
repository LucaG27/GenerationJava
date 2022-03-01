package esercizi_11_01;

public class Exercise7 {

	public static void main(String[] args) {

		System.out.println("--- Inizio Esercizio 7 ---");
		//Long non basta ma 100 sono eccessivi
		long num1 = 0, num2 = 1;
		int counter = 0;
		while (counter < 100) {
			System.out.println(num1 + " ");
			long num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
		System.out.println("\n--- Fine Esercizio 7 ---\n");
	}

}
