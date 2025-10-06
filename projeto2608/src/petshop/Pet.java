package petshop;

public class Pet {
	
	private String nome;
	private String idade;
	private String peso;
	private String especie;
	private String raca;
	private Cliente dono;
	
	//Tem dois construtores possíveis: um com todas as informações, e outro sem a raça. 
	//Isso porque uma papagaio, por exemplo, é só um papagaio. Não existem espécies de papagaio.
	public Pet(String nome, String idade, String peso, String especie, String raca, Cliente dono) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.especie = especie;
		this.raca = raca;
		this.dono = dono;
		//Adiciona na lista global
		RepositorioPets.adicionarPet(this);
	}
	
	public Pet(String nome, String idade, String peso, String especie, Cliente dono) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.especie = especie;
		this.raca = "Raça indeterminada";
		this.dono = dono;
		//Adiciona na lista global
		RepositorioPets.adicionarPet(this);
	}
	
	
	//Apenas gets e sets abaixo
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	
}
