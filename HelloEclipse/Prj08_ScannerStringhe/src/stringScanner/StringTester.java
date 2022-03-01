package stringScanner;

public class StringTester {

	public static void main(String[] args) {
		
		
		String nome;                // Dichiarazione
		nome = "Luca";             //  Assegnazione 
		System.out.println(nome); // Accesso
		nome.charAt(3);
		
		// Utilizzando charAt in un ciclo posso scansionare la mia stringa
		// alla ricerca di caratteri
		char a = nome.charAt(0);
		System.out.println(a);
		
		// Operatore di comparazione tra stringhe
		boolean b = nome.equals("Marco");
		boolean b1 = nome.equalsIgnoreCase ("MaRcO");
		System.out.println(b);
		
		// Unisce 2 stringhe
		
		String c = nome.concat(" Giorgio");
		System.out.println(c);
		
		// Serve per verificare se una stringa contiene 
		//un carattere o una sottostringa
		
		boolean d = nome.contains("L");
		boolean d1 = nome.contains("Luc");
		System.out.println(d);
		System.out.println(d1);
		
		// Esiste anche la variante che mi dice in che indice si trova
		// il carattere o la sottostringa
		
		int f = nome.indexOf("L");
			int f1 = nome.indexOf("Lu");
				System.out.println(f1);
		
		// Modificatori di casing
		
		String min = nome.toLowerCase();
		System.out.println(min);
		String mai = nome.toUpperCase();
		System.out.println(mai);
		
		// Rimozione spazi
		
		String cognome = "         De Rossi      ";
		System.out.println(cognome.trim());
		
		// Sottostringhe
		
		 String nomeCompleto = "Luca Dei Campi";
		
		int indiceUltimoSpazio = nomeCompleto.lastIndexOf(" ");
		int lunghezzaStringa = nomeCompleto.length();
		String soloUltimoCognome = nomeCompleto.substring(indiceUltimoSpazio, lunghezzaStringa);
		
		System.out.println(soloUltimoCognome);
		
		// Replace
		
		String testo = "te$t $empre!";
		testo = testo.replace("$", "s");
		System.out.println(testo);
		
		// Replace sottostringhe
		
		String aCapo = "Ciao \n come \n stai";
		aCapo = aCapo.replace("\n", "").replace("Ciao", "Hello");
		System.out.println(aCapo);
		

	}

}
