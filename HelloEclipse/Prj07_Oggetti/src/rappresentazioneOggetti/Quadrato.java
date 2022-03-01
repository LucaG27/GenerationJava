package rappresentazioneOggetti;

public class Quadrato {
	
	//costruttore implicito
	
	public Quadrato(){
		
	}
	
	//costruttore Implementato
	
	
	public Quadrato(int lato){
		this.lato=lato;
	}
	
	
	// attributi
	int lato;

	// Metodi
	public int calcoloPerimetro() {
		int perimetro = lato*4;
		return perimetro;

	}

	public int calcoloArea() {
		int area=lato*lato;
		return area;

	}
	
	// get e set

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}


}
