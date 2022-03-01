package interfacce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eccezione {

	public static void main(String[] args) throws Exception {

		// eccezioni checked e unchecked

		int[] array = new int[3];

		// 0 1 2 - > 3 da qui in poi non esiste piu nulla



		// costrutto try catch

		// Try - blocchi di codice da provare ad eseguire
		
		try {
			array[3] = 2;

		} catch (Exception ex) {
		// Try - blocchi di codice da eseguire in caso di eccezione
			System.out.println("Errore relativo all'array");
		} finally { // Non obbligatorio
		// dopo aver eseguito i blocchi di codice con/senza errrori, eseguiamo il blocco
		// successivo
			System.out.println("Ciao");
		} 
		
		
		try {
			
			array[3] = 2;

		} catch (ArrayIndexOutOfBoundsException ex1) {
		
			System.out.println("Errore relativo all'array");
		
		} catch (Exception ex2) {
			
			System.out.println("Errore relativo all'esecuzione del programma");
		} finally {
			
			System.out.println("Ciao");
		}
		
		
	/*	try {
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci un numero: ");
			input.nextInt();
		
		}catch(InputMismatchException ex3) {
			System.out.println("Errore di tipo InputMismatch");
			System.out.println(ex3.getStackTrace());
			
		}catch(Exception ex4) {
			System.out.println("Errore durante l'esecuzione del programma");
			
			ex4.getStackTrace(); */
			
			Scanner input = new Scanner(System.in);
			
		   
			if(input.hasNext()) {
				System.out.println("Inserire Pluto");
				String ciao = input.nextLine();
				if(input.equals("pluto")) {
					System.out.println("Bravo!");
				
			}else 
				throw new Exception("Non hai scritto Pluto!");
				
		}

	}

}
