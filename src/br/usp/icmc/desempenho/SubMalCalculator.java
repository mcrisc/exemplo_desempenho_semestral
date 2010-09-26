package br.usp.icmc.desempenho;

public class SubMalCalculator extends MediaProvaCalculator {

	@Override
	public double calculate(double p1, double p2, double sub) {
		return (max(p1, p2) + sub) / 2;	}
	
	private double max(double valor1, double valor2) {
		return valor1 > valor2 ? valor1 : valor2;
	}
	
	
	
}
