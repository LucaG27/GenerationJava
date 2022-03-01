package rappresentazioneOggetti;

public class Main {

	public static void main(String[] args) {
		
		
		Casa casaMia = new Casa();
		casaMia.nuovoAffitto();
		casaMia.setNome("Casa Torino");
		casaMia.setIndirizzo("Via Milano 4");
		System.out.println(casaMia.getIndirizzo());
		
		Quadrato quadrato1 = new Quadrato();
		quadrato1.setLato(2);
		
		Quadrato quadrato2 = new Quadrato(2); //SENZA SETTERS
		
		int perimetro = quadrato1.calcoloPerimetro();
		System.out.println("perimetro --> "+perimetro);
		
		int area=quadrato1.calcoloArea();
		System.out.println("Area --> "+area);

	}

}
