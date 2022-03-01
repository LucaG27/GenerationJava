package view;

import java.util.List;
import java.util.Scanner;
import control.DistributoreCtrl;
import model.ColonninaElettrica;
import model.Distributore;
import model.DistributoreGas;

public class ProvaDistributori {

	public static void main(String[] args) {

		DistributoreCtrl ctrl = new DistributoreCtrl();
		Distributore dis = new Distributore(null, null, 0, 0);
		Distributore di = new Distributore(null, null);

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Inserisci un nome per il distributore: "); String
		 * nomeDistributore = sc.nextLine();
		 * System.out.println("Inserisci un indirizzo per il distributore: "); String
		 * indirizzoDistributore = sc.nextLine();
		 * System.out.println("Qual'è il tipo del distributore?: "); String tipoDis =
		 * sc.nextLine();
		 * 
		 * if (tipoDis.contentEquals("ordinario")) {
		 * ctrl.addDistributore(nomeDistributore, indirizzoDistributore, 0, 0);
		 * 
		 * } else if (tipoDis.contentEquals("gas")) {
		 * ctrl.addDistributoreGas(nomeDistributore, indirizzoDistributore, 0, 0, 0);
		 * 
		 * } else if (tipoDis.contentEquals("elettrico")) {
		 * ctrl.addColonninaElettrica(nomeDistributore, indirizzoDistributore, 0, 0, 0,
		 * 0); }
		 */
		boolean cicla = true;
		System.out.println("Scegli un distributore (ordinario,gas,elettrico)");
		String a = sc.nextLine();
		switch (a) {
		case "ordinario":
			System.out.println("Inserisci un nome per il distributore: ");
			String nomeDistributore = sc.nextLine();
			System.out.println("Inserisci un indirizzo per il distributore: ");
			String indirizzoDistributore = sc.nextLine();

			while (cicla) {
				for (int i = 0; i < 1; i++) {
					System.out.println("Cosa vuoi fare? a) rifornimento distributore b) rifornimento auto");
					String tipoDis = sc.nextLine();

					if (tipoDis.equals("a")) {
						System.out.println("quanta benzina vuoi mettere?");
						int scelta = sc.nextInt();
						System.out.println("quanto diesel vuoi mettere?");
						int scelta2 = sc.nextInt();
						ctrl.addDistributore(nomeDistributore, indirizzoDistributore, scelta, scelta2);
						System.out.println(ctrl.getDistributori());
						
	

					} else if (tipoDis.equals("b")) {
						
						
					}

				}
			}
			break;

		case "gas":
			System.out.println("Inserisci un nome per il distributore: ");
			String nomeDistributore2 = sc.nextLine();
			System.out.println("Inserisci un indirizzo per il distributore: ");
			String indirizzoDistributore2 = sc.nextLine();
			ctrl.addDistributoreGas(nomeDistributore2, indirizzoDistributore2, 0, 0, 0);

		case "elettrico":
			System.out.println("Inserisci un nome per il distributore: ");
			String nomeDistributore3 = sc.nextLine();
			System.out.println("Inserisci un indirizzo per il distributore: ");
			String indirizzoDistributore3 = sc.nextLine();
			ctrl.addColonninaElettrica(nomeDistributore3, indirizzoDistributore3, 0, 0, 0, 0);

		}
	}
}
/*
 * 
 * 
 * 
 * while (cicla) { System.out.println();
 * System.out.print("Digita una scelta : "); System.out.println();
 * System.out.println("a) Aggiungi informazioni distributore");
 * System.out.println("b) Rifornimento distributore");
 * System.out.println("c) Rifornimento auto"); System.out.println("d) Esci");
 * String sceltaCaricaInfo = sc.nextLine(); switch (sceltaCaricaInfo) {
 * 
 * case "a": System.out.println("Inserisci un nome per il distributore: ");
 * String nomeDistributore = sc.nextLine();
 * System.out.println("Inserisci un indirizzo per il distributore: "); String
 * indirizzoDistributore = sc.nextLine(); System.out.
 * println("Qual'è il tipo del distributore? (ordinario, gas, elettrico): ");
 * String tipoDis = sc.nextLine();
 * 
 * if (tipoDis.contentEquals("ordinario")) {
 * ctrl.addDistributore(nomeDistributore, indirizzoDistributore, 0, 0);
 * 
 * } else if (tipoDis.contentEquals("gas")) {
 * ctrl.addDistributoreGas(nomeDistributore, indirizzoDistributore, 0, 0, 0);
 * 
 * } else if (tipoDis.contentEquals("elettrico")) {
 * ctrl.addColonninaElettrica(nomeDistributore, indirizzoDistributore, 0, 0, 0,
 * 0); } break;
 * 
 * 
 * case "b": System.out.print("Quale distributore vuoi caricare? ");
 * System.out.println(); System.out.println("1) Ordinario");
 * System.out.println("2) Gas"); System.out.println("3) Elettrico"); String
 * tipoCarb = sc.nextLine();
 * 
 * if (tipoCarb.contentEquals("1")) { int litriBenzina = sc.nextInt(); int
 * litriDiesel = sc.nextInt(); int litriGas = sc.nextInt();
 * 
 * 
 * } else if (tipoCarb.contentEquals("2")) { int litriBenzina = sc.nextInt();
 * int litriDiesel = sc.nextInt(); int litriGas = sc.nextInt();
 * 
 * 
 * } else if (tipoCarb.contentEquals("3")) { int litriBenzina = sc.nextInt();
 * int litriDiesel = sc.nextInt(); int litriGas = sc.nextInt(); double
 * kwCaricati = sc.nextDouble();
 * 
 * } break;
 * 
 * case "c": System.out.println(ctrl.getDistributori()); int sceltaUtente3 =
 * sc.nextInt(); switch (sceltaUtente3) {
 * 
 * case 1: System.out.print("Quanti litri di benzina vuoi caricare?"); int
 * litriBenzina = sc.nextInt(); System.out.println(litriBenzina);
 * 
 * break;
 * 
 * case 2: System.out.print("Quanti litri di diesel vuoi caricare?"); int
 * litriDiesel = sc.nextInt(); System.out.println(litriDiesel);
 * 
 * break;
 * 
 * case 3: break;
 * 
 * case 4: cicla = false; break; } } } } }
 */
