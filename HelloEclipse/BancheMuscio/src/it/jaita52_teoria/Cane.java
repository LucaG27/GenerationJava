package it.jaita52_teoria;

public class Cane extends Animale {
	public void emettiSuono() {
		System.out.println("Il cane fa bau");
	}
	
	public void pippo() {
		
		super.emettiSuono(); //prende il metodo emetti suono dalla super classe (A nimale)
	}

}
