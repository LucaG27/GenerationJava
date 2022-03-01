 package model;

public class Distributore {
	
	private String nomeDistributore;
	private String indirizzoDistributore;
	private int capBenzina;
	private int capDiesel;
	
	
	public Distributore(String nomeDistributore, String indirizzoDistributore) {
		super();
		this.nomeDistributore = nomeDistributore;
		this.indirizzoDistributore = indirizzoDistributore;
	}
	
	
	public Distributore(int capBenzina, int capDiesel) {
		super();
		this.capBenzina = capBenzina;
		this.capDiesel = capDiesel;
	}


	public Distributore(String nomeDistributore, String indirizzoDistributore, int capBenzina, int capDiesel) {
		super();
		this.nomeDistributore = nomeDistributore;
		this.indirizzoDistributore = indirizzoDistributore;
		this.capBenzina = capBenzina;
		this.capDiesel = capDiesel;
	}

	public String getNomeDistributore() {
		return nomeDistributore;
	}

	public void setNomeDistributore(String nomeDistributore) {
		this.nomeDistributore = nomeDistributore;
	}

	public String getIndirizzoDistributore() {
		return indirizzoDistributore;
	}

	public void setIndirizzoDistributore(String indirizzoDistributore) {
		this.indirizzoDistributore = indirizzoDistributore;
	}

	public int getCapBenzina() {
		return capBenzina;
	}

	public void setCapBenzina(int capBenzina) {
		this.capBenzina = capBenzina;
	}

	public int getCapDiesel() {
		return capDiesel;
	}

	public void setCapDiesel(int capDiesel) {
		this.capDiesel = capDiesel;
	}

	@Override
	public String toString() {
		return "Il distributore " + nomeDistributore + " di " + indirizzoDistributore
				+ " è stato caricato di: " + capBenzina + " litri di Benzina "+ capDiesel + " litri di Diesel ";
	}

}
