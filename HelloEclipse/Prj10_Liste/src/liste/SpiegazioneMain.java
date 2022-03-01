package liste;

import java.util.ArrayList;
import java.util.List;

public class SpiegazioneMain {
	
	public static void main(String[] args) {
/*	
	List <String> nomeLista = new ArrayList <>();
	
	String[] arrayStringhe = new String [9999];
	arrayStringhe[0] = "Ciao";
	
	System.out.println(arrayStringhe[0]);
	
	List <String> listaStringhe = new ArrayList <>();
	listaStringhe.add("Ciao");
	listaStringhe.add(2, "Bella");
	listaStringhe.get(0);
	
	listaStringhe.clear(); // Svuota lista
	listaStringhe.contains("Ciao"); // Cerco se l'oggetto è presente in lista
	listaStringhe.size(); // Conteggio
	listaStringhe.remove(0); // Svuota cella dell'indice indicato
	*/
	/*
	 * Vogliamo capire mediante una dimostrazione se il .add chiamato senza parametri
	 * crea per forza una cella nuova, oppure riutilizza la prima vuota disponibile
	 */
	
	List <String> testList = new ArrayList<>();
	testList.add("Stringa1");
	testList.add("Stringa2");
	testList.add("Stringa3");
	testList.add("Stringa4");
	
	for(int i = 0 ; i < testList.size(); i++) {
		
		System.out.println("Contenuto di "+i+ " : " +testList.get(i));
	}
	
	testList.remove(2);
	
	System.out.println("-------------------");
	
	for(int i = 0 ; i < testList.size(); i++) {
		
		System.out.println("Contenuto di "+i+ " : " +testList.get(i));

	}	

	}
	
}
