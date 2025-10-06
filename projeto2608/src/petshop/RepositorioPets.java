package petshop;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPets {
	//Lista de todos os pets que existem. Quando um pet é adicionado ou excluído, a lista é atualizada automaticamente.
	private static List<Pet> petsGlobais = new ArrayList<Pet>();
	
	
	
	//Método que retorna informações básicas de todos os pets existentes.
	public static void listarPets() {
		System.out.println("---------- Lista global de pets ----------");
		int i = 0;
		for(Pet p : petsGlobais){
			i++;
			System.out.println(Integer.toString(i) + ": " + p.getEspecie() + " chamado(a) " + p.getNome() + ", do cliente " + p.getDono().getNome());
		}
	};
	
	public static List<Pet> getPets(){
		return petsGlobais;
	}
		
	//Método para adicionar pet na lista global
	public static void adicionarPet(Pet pet) {
		petsGlobais.add(pet);
	}
	
	//Método para remover pet da lista global.
	public static void removerPet(Pet pet) {
		petsGlobais.remove(pet);
		pet.getDono().removerPet(pet);
	}
	
	
	//Criei só pra testar. Vou deletar depois caso eu lembre. Se ver isso aqui, pode apagar.
	public static void main(String[] args) {
		Cliente c1 = new Cliente("pedro", "pedro@exemplo.com", "1254333");
		Pet p1 = new Pet("Roberto", "12,", "Normal", "Anta", c1);
		System.out.println(p1.getDono().getNome());
		System.out.println(": " + p1.getEspecie() + " chamado " + p1.getNome() + ", do cliente " + p1.getDono().getNome());
	}
}
