package it.jaita52_esercizi;

import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
		// Acquisire una stringa di caratteri, contenente pure degli spazi.
		// Scrivere un procedimento tale che, ogni volta che viene trovato uno spazio,
		// vengano soppressi eventuali altri spazi contigui (due o piu').
		// Ad esempio, se l'utente inserisce la stringa
		// "Oggi è una          bella giornata...         di pioggia!!!"
		// la stringa risultante sarà
		// Oggi è una bella giornata... di pioggia!!!

		Scanner sc = new Scanner(System.in);
		String daPulire = sc.nextLine();
		if (daPulire.indexOf("  ") >= 0) {
			System.out.println(daPulire.trim().replaceAll(" +", " "));
		} else {
			System.out.println(daPulire);
		}
	}
}