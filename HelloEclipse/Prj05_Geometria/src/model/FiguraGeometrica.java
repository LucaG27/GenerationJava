package model;

public abstract class FiguraGeometrica { // ABSTRACT CLASS ===>> NON SI PUO' ISTANZIARE

	protected String nome;
	protected String nomeForma;
	
	public abstract double area();
	

	@Override
	public String toString() {
		return "La stanza di nome " + nome + ", di forma " + nomeForma + " ha una superficie di " + area();
	}


	public void prova() {
		// TODO Auto-generated method stub
		
	}

	
	
}
