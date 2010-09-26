package br.usp.icmc.desempenho;

import java.util.ArrayList;
import java.util.List;

public class Desempenho {
	private int nusp;
	private List<Double> notasTrabalhos = new ArrayList<Double>();
	private double notaProva1;
	private double notaProva2;
	
	public double calcularMedia() {
		/*
		 * Ao invés de socar tudo num método só, melhor quebrar em operações
		 * pequenas e bem definidas! 
		 */
		return (2 * calcularMediaTrabalhos() + 3 * calcularMediaProvas()) / 5; 
	}

}
