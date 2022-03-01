package it.jaita52_teoria;

public class Stringhe {

	public static void main(String[] args) {
		          //in una stringa ogni lettera ha una posizione A-0 B-1 C-2
		String s = "ABC";
		final String s1 = new String("ABC");
		String c = "ABC";
		
		System.out.println(s1);
		System.out.println(s);
		
		if(s == c) {
			System.out.println("Vero");
		}else {
			System.out.println("Falso");
		}
		
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		for(int i=0; i < s.length(); i++) { //ABC
			if(s.charAt(i) == 'D') {
				System.out.println("Vi è una lettera B nella variante");
			} else {
				System.out.println("non vi è la lettera in questione");
			}
		}
		
		s = s.concat("YTR");
		System.out.println(s);
		
		//rimozione lettere nella stringa partendo da un indice
		s = s.substring(0,3);
		System.out.println("Primo substring: "+ s);
		//rimozione lettere nella stringa partendo e finendo da un indice

		s = s.substring(0,2);
		
		System.out.println("Secondo substring: "+ s);
		
		String utente = "rossi";
		utente = utente.toUpperCase();
		if(utente.equals("ROSSI")) {
			System.out.println("VERO");
		}else {
			System.out.println("FALSO");
		}
		
		if(utente.equalsIgnoreCase("RosSi")) {
			System.out.println("VERO");
		}else {
			System.out.println("FALSO");
		}

		String numero = String.valueOf(1);
		int casoDiTest = 10;
		numero = String.valueOf(casoDiTest);
		System.out.println("Valore variabile numero: " + casoDiTest);
		
		StringBuilder stb = new StringBuilder("AAAAAA");
		stb.append("Ciao");
		
		System.out.println(stb);
		System.out.println(stb.toString());
		
		String daPulire = " Ciao, mi chiamo Gino     ";
		System.out.println(daPulire.trim());
		 
	}

}
