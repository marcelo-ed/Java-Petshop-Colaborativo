package petshop;

public class ServicoTosa extends Servico {

	private String tipoTosa;
	private double valorFinal;
	public ServicoTosa(String data, Pet petAtendido, String tipoTosa) {
		super("Tosa", 150, data, petAtendido);
		
		//O tipo da tosa vai influenciar no preço final. O preço base é 150 e, se a tosa for diferenciada, pode aumentar
		this.tipoTosa = tipoTosa;
	}
	
	
	
	
	
	//apenas gets and sets abaixo
	public String getTipoTosa() {
		return tipoTosa;
	}
	public double getValorFinal() {
		return valorFinal;
	}
}
