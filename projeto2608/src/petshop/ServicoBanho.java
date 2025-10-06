package petshop;

public class ServicoBanho extends Servico {
	
	private double valorFinal;
	
	//valor base, nesse contexto, é o valor do minuto.
	public ServicoBanho(String data, Pet petAtendido, int quantidadeMinutos) {
		super("Banho", 10, data, petAtendido);
		
		this.valorFinal = this.valorBase * quantidadeMinutos;
	}
	
	
	
	
	//apenas gets and sets abaixo
	public double getValorFinal() {
		return(valorFinal);
	}
}
