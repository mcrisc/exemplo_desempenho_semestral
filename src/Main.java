import br.usp.icmc.desempenho.Desempenho;
import br.usp.icmc.desempenho.DesempenhoPrinter;
import br.usp.icmc.desempenho.MediaProvaCalculator;
import br.usp.icmc.desempenho.SubMalCalculator;


public class Main {
	public static void main(String[] args) {
		final DesempenhoPrinter printer = new DesempenhoPrinter();
		final MediaProvaCalculator mediaCalculator = new SubMalCalculator();
		
		Desempenho desempenho = readDesempenho();
		desempenho.setMediaProvaCalculator(mediaCalculator);
		
		printer.print(desempenho);
	}

	private static Desempenho readDesempenho() {
		Desempenho desempenho = new Desempenho();
		desempenho.setNusp(4511488);
		desempenho.setNotaProva1(3.7);
		desempenho.setNotaProva2(5.2);
		desempenho.setNotaProvaSub(0.5);

		desempenho.addNotaTrabalho(8);
		desempenho.addNotaTrabalho(7.5);
		desempenho.addNotaTrabalho(9);
		
		return desempenho;
	}
}
