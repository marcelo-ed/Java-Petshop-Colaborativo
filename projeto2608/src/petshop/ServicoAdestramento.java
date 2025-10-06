package petshop;

public class ServicoAdestramento extends Servico {
	private double valorFinal;

	public ServicoAdestramento(String data, Pet petAtendido, int numeroDias) {
		super("Adestramento", 200.00, data, petAtendido);

		// cada dia custa 300 reais, o valor final é o (número de dia x 300)
		this.valorFinal = valorBase * numeroDias;
	}

	// apenas gets and sets abaixo
	public double getValorFinal() {
		return valorFinal;
	}
}