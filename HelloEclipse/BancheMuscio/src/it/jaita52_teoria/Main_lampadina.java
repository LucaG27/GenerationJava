package it.jaita52_teoria;

public class Main_lampadina {

	public static void main(String[] args) {
		Lampadina lampCucina = new Lampadina(false);
		Lampadina lampSalotto = new Lampadina(false);
		lampCucina.accendi();
		lampCucina.getCalore();
		System.out.println("Stato lampadina Cucina: " + lampCucina.isAccesa());
		System.out.println("Stato lampadina Salotto: " + lampCucina.getCalore());
		
		Animale rex = new Cane();
		rex.emettiSuono();
		Animale aristoGatto = new gatto();
		aristoGatto.emettiSuono();
		
		Cane fido = new Cane();
		
		fido.pippo();
		
		System.out.println();
		Object o = new Cane();

	}

}
