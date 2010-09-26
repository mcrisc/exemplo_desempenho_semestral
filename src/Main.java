import br.usp.icmc.desempenho.Desempenho;
import br.usp.icmc.desempenho.DesempenhoPrinter;


public class Main {
	public static void main(String[] args) {
		final DesempenhoPrinter printer = new DesempenhoPrinter();
		Desempenho desempenho = readDesempenho();
		
		printer.print(desempenho);
	}

	private static Desempenho readDesempenho() {
		Desempenho desempenho = new Desempenho();
		desempenho.setNusp(4511488);
		desempenho.setNotaProva1(3.7);
		desempenho.setNotaProva2(5.2);

		desempenho.addNotaTrabalho(8);
		desempenho.addNotaTrabalho(7.5);
		desempenho.addNotaTrabalho(9);
		
		return desempenho;
	}
}
