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

	private double calcularMediaProvas() {
		return (notaProva1 + notaProva2) / 2;
	}

	private double calcularMediaTrabalhos() {
		double media = 0;
		
		if (notasTrabalhos.size() > 0) {
			double soma = 0;
			for (double nota : notasTrabalhos) {
				soma += nota;
			}
			
			media = soma / notasTrabalhos.size();
		}
		
		return media;
	}

	public int getNusp() {
		return nusp;
	}

	public void setNusp(int nusp) {
		this.nusp = nusp;
	}

	public double getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public double getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}
	
	public void addNotaTrabalho(double nota) {
		/* Encapsulamento!
		 * O notasTrabalhos pode até ser trocado por um array. Expondo apenas 
		 * o método addNotaTrabalho() você pode fazer essa troca sem quebrar o código
		 * que usa essa classe. 
		 */
		notasTrabalhos.add(nota);
	}
}
