package model;


public class Rettangolo extends FiguraGeometrica {

	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		this.nomeForma = "rettangolare";
	}

	public double perimetro() {
		return 2* (base.calcolaLunghezza() + altezza.calcolaLunghezza());
	}
	
	public double area() {
		System.out.println("ho applicato la formula del rettangolo");
		return base.calcolaLunghezza() * altezza.calcolaLunghezza();
	}

	@Override
	public void prova() {
		// TODO Auto-generated method stub
		
	}
	
	
}


