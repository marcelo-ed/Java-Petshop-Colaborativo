package petshop;

public class ServicoConsulta extends Servico {

	private String nomeVeterinario;
	private double valorFinal = valorBase;

	public ServicoConsulta(String data, Pet petAtendido, String nomeVeterinario) {
		super("Consulta veterinária", 250.00, data, petAtendido);

		this.nomeVeterinario = nomeVeterinario;
	}

	// Apenas gets and sets abaixo
	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public double getValorFinal() {
		return valorFinal;
	}
}
