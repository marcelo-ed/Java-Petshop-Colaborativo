package petshop;

//Essa é uma classe geral de serviços, e vai ser usada como base para todos os outros serviços.
//Inclui nome, preço, data de realização e qual pet será atendido.
public abstract class Servico {
	protected String nome;
	// O nome é "valor base" porque pode ser usado para calcular o valor final. Por
	// exemplo, o valor do
	// banho é calculado por minuto, e o valor base é o valor do minuto nesse
	// contexto.
	protected double valorBase;
	protected String data;
	protected Pet petAtendido;
	protected double valorFinal;

	// Características gerais que todos os serviços devem ter.

	public Servico(String nome, double valorBase, String data, Pet petAtendido) {
		this.nome = nome;
		this.valorBase = valorBase;
		this.data = data;
		this.petAtendido = petAtendido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public String petAtendido() {
		return petAtendido.getNome();
	}
	
	public double getPreco() {
		return valorFinal;
	}
	
	//usei esse nome em alguns lugares do menu, coloquei aqui só pra não dar erro..
	public double getValorFinal() {
		return valorFinal;
	}
}
