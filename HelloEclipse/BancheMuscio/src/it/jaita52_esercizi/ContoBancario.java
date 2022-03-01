package it.jaita52_esercizi;

import java.util.Scanner;

public class ContoBancario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ContoBanca conto1 = new ContoBanca("Raffaele", 0);
		System.out.println("Benvenuto " + conto1.nomeCliente);
		System.out.println("Seleziona un'operazione");
		System.out.println("1) Prelievo");
		System.out.println("2) Versamento");
		System.out.println("3) Saldo");
		int sceltaUtente = input.nextInt();
		switch (sceltaUtente) {
		case 1:
			System.out.println("Qual'è la cifra che vuoi prelevare?");
			String cifraPrelievo = input.next();
			System.out.println("Enter a opening balance");
			break;
		}

	}

}
