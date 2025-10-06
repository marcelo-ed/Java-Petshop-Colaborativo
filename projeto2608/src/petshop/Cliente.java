package petshop;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	
	//Lista de pets do cliente
	private List<Pet> pets = new ArrayList<Pet>();
	
	//Lista de serviços contratados pelo cliente
	private List<Servico> servicosContratados = new ArrayList<Servico>();
	
	
	public List<Servico> getServicosContratados() {
		return servicosContratados;
	}


	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public void adicionarPet(Pet pet) {
		pets.add(pet);
	};
	
	//método que remove o pet escolhido da lista de pets do cliente e da lista global (localizada na classe RepositorioPets).
	public void removerPet(Pet pet) {
		pets.remove(pet);
		RepositorioPets.removerPet(pet);
	}
	
	

	
	
	//Métodos para adicionar e remover serviços do cliente abaixo
	public void adicionarServico(Servico novoServico) {
		servicosContratados.add(novoServico);
	};
	
	public void removerServico(Servico servicoParaRemover) {
		servicosContratados.remove(servicoParaRemover);
	}
	
	public String getNome() {
		return nome;
	};

	
	//Apenas gets and sets abaixo.
	public void setNome(String nome) {
		this.nome = nome;
	};


	public String getEmail() {
		return email;
	};


	public void setEmail(String email) {
		this.email = email;
	};


	public String getTelefone() {
		return telefone;
	};


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	};
	
	public List<Pet> getPets(){
		return(pets);
	}
}



















