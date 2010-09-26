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

	private int calcularMediaProvas() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int calcularMediaTrabalhos() {
		// TODO Auto-generated method stub
		return 0;
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
	
}
