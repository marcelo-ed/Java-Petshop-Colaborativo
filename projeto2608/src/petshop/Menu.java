//ALUNOS: Marcelo Eduardo, Pedro Saldanha e Guilherme Krinski.


package petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	//Essa é a classe principal do projeto. Ela integra todas as classes em um menu interativo.
	//Tem três seções principais: gerenciar clientes, gerenciar pets e gerenciar serviços.
	//Todos os métodos necessários estão dentro de uma dessas três seções. 
	//O sistema começa com alguns pets, clientes e serviços pré-definidos para não precisar criar tudo do zero todas as vezes.
	
	
    private static Scanner sc = new Scanner(System.in);
    
    //Lista de clientes
    private static List<Cliente> clientes = new ArrayList<>();

    
    
    //Só inicializando o programa e inserindo algumas informações iniciais. O código de verdade da classe são os métodos mais abaixo.
    public static void main(String[] args) {
    	
    	//só adicionando alguns dados iniciais aqui, apenas para fins de teste.
        //CLIENTE 1
    	Cliente c1 = new Cliente("Alice", "alice@email.com", "65-342");
        Pet p1 = new Pet("antonio", "2", "Cachorro", "12", "Golden", c1);
        Pet p2 = new Pet("Mimi", "3", "Gato", "4", "Siamês", c1);
        c1.adicionarPet(p1);
        c1.adicionarPet(p2);

        Servico s1 = new ServicoBanho("2025-10-01", p1, 30);
        Servico s2 = new ServicoTosa("2025-10-02", p2, "Higiênica");
        c1.adicionarServico(s1);
        c1.adicionarServico(s2);

        clientes.add(c1);
        RepositorioPets.adicionarPet(p1);
        RepositorioPets.adicionarPet(p2);

        // CLIENTE 2
        Cliente c2 = new Cliente("Bruno", "alice@email.com", "2345");
        Pet p3 = new Pet("Fredd", "2", "Cachorro", "8", "Shih Tzu", c2);
        c2.adicionarPet(p3);

        Servico s3 = new ServicoHospedagem("2025-10-05", p3, 3);
        c2.adicionarServico(s3);

        clientes.add(c2);
        RepositorioPets.adicionarPet(p3);

        // ===== CLIENTE 3 =====
        Cliente c3 = new Cliente("Carla", "carla@email.com", "1234");
        Pet p4 = new Pet("Lua", "1", "Gato", "3", "Persa", c3);
        c3.adicionarPet(p4);

        Servico s4 = new ServicoAdestramento("2025-10-07", p4, 5);
        c3.adicionarServico(s4);

        clientes.add(c3);
        RepositorioPets.adicionarPet(p4);


        System.out.println("O sistema já começa com alguns dados iniciais para teste.");
        
        //Iniciando o método principal.
        exibirMenuPrincipal();   
    }

    
    
    
    
    // ====================== MENU PRINCIPAL ======================
    public static void exibirMenuPrincipal() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Pets");
            System.out.println("3. Gerenciar Serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1 -> menuClientes();
                case 2 -> menuPets();
                case 3 -> menuServicos();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // ====================== MENU CLIENTES ======================
    private static void menuClientes() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU CLIENTES ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Buscar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> listarClientes();
                case 3 -> buscarCliente();
                case 4 -> excluirCliente();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        clientes.add(new Cliente(nome, email, telefone));
        System.out.println("Parabens! Cliente cadastrado com sucesso!");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n=== CLIENTES CADASTRADOS ===");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
    }

    private static void buscarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        Cliente cliente = buscarClientePorNome(nome);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void excluirCliente() {
        System.out.print("Digite o nome do cliente a ser removido: ");
        String nome = sc.nextLine();

        Cliente cliente = buscarClientePorNome(nome);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Parabens! Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // ====================== MENU PETS ======================
    private static void menuPets() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU PETS ===");
            System.out.println("1. Cadastrar Pet");
            System.out.println("2. Listar Pets");
            System.out.println("3. Buscar Pet");
            System.out.println("4. Excluir Pet");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1 -> cadastrarPet();
                case 2 -> listarPets();
                case 3 -> buscarPet();
                case 4 -> excluirPet();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarPet() {
        System.out.print("Nome do dono do pet: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado. Cadastre o cliente primeiro.");
            return;
        }

        System.out.print("Nome do pet: ");
        String nomePet = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Idade: ");
        String idade = sc.nextLine();
        System.out.print("Peso (kg): ");
        String peso = sc.nextLine();

        Pet novoPet = new Pet(nomePet, idade, especie, peso, raca, cliente);
        cliente.adicionarPet(novoPet);
        RepositorioPets.adicionarPet(novoPet);

        System.out.println("Parabens! Pet cadastrado com sucesso!");
    }

    private static void listarPets() {
        List<Pet> pets = RepositorioPets.getPets();
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        System.out.println("\n=== PETS CADASTRADOS ===");
        for (Pet pet : pets) {
            System.out.println("- " + pet.getNome() + " (" + pet.getEspecie() + "), dono: " + pet.getDono().getNome());
        }
    }

    private static void buscarPet() {
        System.out.print("Digite o nome do pet: ");
        String nome = sc.nextLine();

        Pet pet = buscarPetPorNome(nome);
        if (pet != null) {
            System.out.println("Pet encontrado: " + pet.getNome() + " | Dono: " + pet.getDono().getNome());
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    private static void excluirPet() {
        System.out.print("Digite o nome do pet: ");
        String nome = sc.nextLine();

        Pet pet = buscarPetPorNome(nome);
        if (pet != null) {
            Cliente dono = pet.getDono();
            dono.removerPet(pet);
            System.out.println("Parabens! Pet removido com sucesso!");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    // ====================== MENU SERVIÇOS ======================
    private static void menuServicos() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU SERVIÇOS ===");
            System.out.println("1. Contratar Serviços");
            System.out.println("2. Listar Serviços de um Cliente");
            System.out.println("3. Cancelar Serviço");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1 -> contratarServicos();
                case 2 -> listarServicosCliente();
                case 3 -> cancelarServico();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    
    
	 // Método para contratar serviços para um pet de um cliente
	 // Passos:
	 // 1. Selecionar o cliente
	 // 2. Escolher o pet
	 // 3. Adicionar um ou mais serviços, coletando todas as informações necessárias
	 // 4. Calcular valor total e aplicar desconto se houver múltiplos serviços
	 // 5. Confirmar contratação
    private static void contratarServicos() {
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        if (cliente.getPets().isEmpty()) {
            System.out.println("O cliente não possui pets cadastrados.");
            return;
        }

        System.out.println("\nPets do cliente:");
        for (int i = 0; i < cliente.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + cliente.getPets().get(i).getNome());
        }

        System.out.print("Escolha o número do pet: ");
        int indicePet = Integer.parseInt(sc.nextLine()) - 1;
        if (indicePet < 0 || indicePet >= cliente.getPets().size()) {
            System.out.println("Pet inválido.");
            return;
        }
        Pet pet = cliente.getPets().get(indicePet);

        List<Servico> carrinho = new ArrayList<>();
        boolean adicionarMais = true;

        while (adicionarMais) {
            System.out.println("\nEscolha o serviço:");
            System.out.println("1. Banho");
            System.out.println("2. Tosa");
            System.out.println("3. Hospedagem");
            System.out.println("4. Adestramento");
            System.out.print("Opção: ");
            int opcaoServico = Integer.parseInt(sc.nextLine());

            Servico servico = null;

            switch (opcaoServico) {
                case 1 -> { // Banho
                    System.out.print("Informe a data do serviço (AAAA-MM-DD): ");
                    String data = sc.nextLine();
                    System.out.print("Informe a duração do banho em minutos: ");
                    int minutos = Integer.parseInt(sc.nextLine());
                    servico = new ServicoBanho(data, pet, minutos);
                }
                case 2 -> { // Tosa
                    System.out.print("Informe a data do serviço (AAAA-MM-DD): ");
                    String data = sc.nextLine();
                    System.out.print("Informe o tipo de tosa: ");
                    String tipoTosa = sc.nextLine();
                    servico = new ServicoTosa(data, pet, tipoTosa);
                }
                case 3 -> { // Hospedagem
                    System.out.print("Informe a data do início da hospedagem (AAAA-MM-DD): ");
                    String data = sc.nextLine();
                    System.out.print("Informe o número de dias: ");
                    int dias = Integer.parseInt(sc.nextLine());
                    servico = new ServicoHospedagem(data, pet, dias);
                }
                case 4 -> { // Adestramento
                    System.out.print("Informe a data do início do adestramento (AAAA-MM-DD): ");
                    String data = sc.nextLine();
                    System.out.print("Informe o número de dias: ");
                    int dias = Integer.parseInt(sc.nextLine());
                    servico = new ServicoAdestramento(data, pet, dias);
                }
                default -> System.out.println("Serviço inválido.");
            }

            if (servico != null) {
                carrinho.add(servico);
                System.out.println("Serviço adicionado ao carrinho!");
            }

            System.out.print("Deseja adicionar outro serviço? (s/n): ");
            adicionarMais = sc.nextLine().equalsIgnoreCase("s");
        }

        double total = 0;
        for (Servico s : carrinho) {
            // usando getValorFinal das classes
            total += s.getValorFinal();
        }

        if (carrinho.size() > 1) {
            System.out.println("Aplicando 10% de desconto por múltiplos serviços...");
            total *= 0.9;
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);
        System.out.print("Confirmar contratação? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            for (Servico s : carrinho) {
                cliente.adicionarServico(s);
            }
            System.out.println("Parabens! Serviços contratados com sucesso!");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private static void listarServicosCliente() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        Cliente cliente = buscarClientePorNome(nome);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        List<Servico> servicos = cliente.getServicosContratados();
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço contratado.");
            return;
        }

        System.out.println("\n=== SERVIÇOS CONTRATADOS ===");
        for (Servico s : servicos) {
            System.out.println("- " + s.getNome() + " | Data: " + s.getData() + " | Preço: R$ " + s.getPreco());
        }
    }

    private static void cancelarServico() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        Cliente cliente = buscarClientePorNome(nome);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        List<Servico> servicos = cliente.getServicosContratados();
        if (servicos.isEmpty()) {
            System.out.println("O cliente não possui serviços contratados.");
            return;
        }

        for (int i = 0; i < servicos.size(); i++) {
            Servico s = servicos.get(i);
            System.out.println((i + 1) + ". " + s.getNome() + " (" + s.getData() + ")");
        }

        System.out.print("Escolha o número do serviço a cancelar: ");
        int indice = Integer.parseInt(sc.nextLine()) - 1;
        if (indice < 0 || indice >= servicos.size()) {
            System.out.println("Serviço inválido.");
            return;
        }

        Servico servico = servicos.get(indice);
        cliente.removerServico(servico);
        System.out.println("Parabens! Serviço cancelado com sucesso!");
    }

    // ====================== MÉTODOS AUXILIARES ======================
    private static Cliente buscarClientePorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    private static Pet buscarPetPorNome(String nome) {
        for (Pet p : RepositorioPets.getPets()) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
    
    
}
