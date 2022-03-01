package model;

public class ConcoCorrente {

	private double saldo;
	private String nomeCliente;

	public ConcoCorrente(String nomeCliente) {

		this.nomeCliente = nomeCliente;
		saldo = 0.0;
	}

	public double getSaldo() {

		return saldo;
	}

	public String getCliente() {

		return nomeCliente;
	}

	public void versamento(double somma) {

		if (somma >= 1) {
			saldo += somma;
			
		} else

			System.out.println(nomeCliente + " non puoi versare una somma inferiore a 1€");
	}

	public void prelievo(double somma) {
		if (somma < saldo) {

			saldo -= somma;
		} else

			System.out.println(nomeCliente + " non hai i fondi necessare per il prelievo");
	}
}
