package model;

public class ColonninaElettrica extends DistributoreGas {

	private double kwRicarica;

	public ColonninaElettrica(String nomeDistributore, String indirizzoDistributore, int capBenzina, int capDiesel,
			int capGas, double kwRicarica) {
		super(nomeDistributore, indirizzoDistributore, capBenzina, capDiesel, capGas);
		this.kwRicarica = kwRicarica;
	}

	public double getKwRicarica() {
		return kwRicarica;
	}

	public void setKwRicarica(double kwRicarica) {
		this.kwRicarica = kwRicarica;
	}
	
	@Override
	public String toString() {
		
		String s = super.toString();
		return s;
	}
}
