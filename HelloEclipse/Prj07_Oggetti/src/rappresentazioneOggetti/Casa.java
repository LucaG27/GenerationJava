package rappresentazioneOggetti;

public class Casa {

	
	//ATTRIBUTI e METODI/FUNZIONI
	
	//ATTRIBUTI
	
	//ATTRIBUTI STATICI
	private String nome;
	private String indirizzo;
	private int numPiani;
	//dati dinamici
	boolean abitata;
	
	
	//METODI MODIFICATORI
	public void nuovoAffitto() {
		
		abitata=true;
	}
	
	public void terminaAffitto() {
		
		abitata=false;
	}
	
	//GETTERS IMPORTA VALORI ATTRIBUTO
	public String getIndirizzo() {
		return indirizzo;
	}		
	
	public String getNome() {
		return nome;
	}
	//SETTERS IMPOSTARE VALORI ATTRIBUTO
	public void setIndirizzo(String indirizzo) {
		this.indirizzo=indirizzo;
		
	}
	
	public void setNome(String nome) {
		this.nome=nome;
		
	}
}
