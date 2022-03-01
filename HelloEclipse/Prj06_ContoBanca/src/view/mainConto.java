package view;

import java.util.Scanner;

import model.ConcoCorrente;

public class mainConto {

	public static void main(String[] args) {

		ConcoCorrente cliente1 = new ConcoCorrente("Carlo");
		ConcoCorrente cliente2 = new ConcoCorrente("Mattia");
		ConcoCorrente cliente3 = new ConcoCorrente("Giulia");
		
		cliente2.versamento(500);
		cliente3.versamento(1000);
		double mediaSaldo = cliente1.getSaldo()+cliente2.getSaldo()+cliente3.getSaldo()/3;

		Scanner input = new Scanner(System.in);

		//System.out.println("Seleziona l'utente");
		boolean quit = false;
		do {

			System.out.print("Digita una scelta : ");
			System.out.println();
			System.out.println("1) Prelievo");
			System.out.println("2) Versamento");
			System.out.println("3) Saldo");
			System.out.println("4) Media Saldo");
			System.out.println("5) Esci");
			System.out.println();
			int sceltaUtente = input.nextInt();
			switch (sceltaUtente) {
			case 1:
				System.out.println("Inserisci la somma da prelevare");
				double sommaPrelevare = input.nextDouble();
				cliente1.prelievo(sommaPrelevare);
				System.out.println(cliente1.getCliente() + " ha € " + cliente1.getSaldo());
				break;

			case 2:
				System.out.println("Inserisci la somma da versare");
				double sommaVersare = input.nextDouble();
				cliente1.versamento(sommaVersare);
				System.out.println(cliente1.getCliente() + " ha € " + cliente1.getSaldo());
				break;

			case 3:
				System.out.println(cliente1.getSaldo());
				break;

			case 4:
				System.out.println("La media dei 3 conti è: "+ Math.round(mediaSaldo));
			case 5:
				System.exit(0);
			}
		} while (!quit);
	}

}
