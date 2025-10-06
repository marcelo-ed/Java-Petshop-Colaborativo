package petshop;

public class ServicoHospedagem extends Servico {
	private double valorFinal;

	public ServicoHospedagem(String data, Pet petAtendido, int numeroDias) {
		super("Hospedagem", 300.00, data, petAtendido);

		// cada dia custa 300 reais, o valor final é o (número de dia x 300)
		this.valorFinal = valorBase * numeroDias;
	}

	// apenas gets and sets abaixo
	public double getValorFinal() {
		return valorFinal;
	}
}
