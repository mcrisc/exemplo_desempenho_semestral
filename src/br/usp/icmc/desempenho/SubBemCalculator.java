package br.usp.icmc.desempenho;

import java.util.Arrays;

public class SubBemCalculator extends MediaProvaCalculator {

	@Override
	public double calculate(double p1, double p2, double sub) {
		double[] notas = {p1, p2, sub};
		Arrays.sort(notas);
		
		return (notas[2] + notas[1]) / 2; // as duas maiores notas
	}

}
