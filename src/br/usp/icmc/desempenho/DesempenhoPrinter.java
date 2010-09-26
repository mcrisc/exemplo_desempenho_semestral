package br.usp.icmc.desempenho;

public class DesempenhoPrinter {
	public void print(Desempenho desempenho) {
		System.out.println("NUSP: " + desempenho.getNusp());
		System.out.printf("Média: %.1f\n", desempenho.calcularMedia());
		
	}
}
