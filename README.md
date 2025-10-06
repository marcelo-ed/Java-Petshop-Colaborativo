# Java-Petshop-Colaborativo
Projeto de petshop desenvolvido em java, criado por três estudantes para um trabalho universitário da matéria Programação Orientada a Objetos.

Sistema de Gerenciamento de Pet Shop
Este é um sistema simples de gerenciamento para um pet shop, desenvolvido em Java. O projeto permite o cadastro e a gestão de clientes, seus pets e os serviços contratados. A interação com o sistema é feita através de um menu no console.

Autores
Marcelo Eduardo

Pedro Saldanha

Guilherme Krinski

Funcionalidades
O sistema é dividido em três módulos principais:

1. Gerenciamento de Clientes
Cadastrar Cliente: Adiciona um novo cliente ao sistema, solicitando nome, e-mail и telefone.

Listar Clientes: Exibe uma lista com o nome de todos os clientes cadastrados.

Buscar Cliente: Procura por um cliente específico pelo nome e exibe seus dados.

Excluir Cliente: Remove um cliente do sistema.

2. Gerenciamento de Pets
Cadastrar Pet: Adiciona um novo pet, associando-o a um cliente já existente.

Listar Pets: Mostra todos os pets cadastrados no sistema, com o nome do pet, sua espécie e o nome do dono.

Buscar Pet: Procura por um pet específico pelo nome.

Excluir Pet: Remove um pet do sistema.

3. Gerenciamento de Serviços
Contratar Serviços: Permite a contratação de um ou mais serviços para um pet específico. Os serviços disponíveis são:

Banho

Tosa

Hospedagem

Adestramento

Desconto: É aplicado um desconto de 10% automaticamente se mais de um serviço for contratado na mesma operação.

Listar Serviços de um Cliente: Mostra o histórico de serviços contratados por um cliente.

Cancelar Serviço: Permite o cancelamento de um serviço previamente agendado.

Estrutura do Projeto
O projeto é organizado nas seguintes classes:

Menu.java: Classe principal que contém o método main. É responsável por toda a interação com o usuário, exibindo os menus e processando as opções escolhidas.

Cliente.java: Modela o cliente, com seus dados pessoais e listas de pets e serviços contratados.

Pet.java: Representa o animal de estimação, contendo suas características e a referência ao seu dono.

RepositorioPets.java: Mantém uma lista global de todos os pets cadastrados no sistema para facilitar o acesso e a listagem.

Servico.java: Classe abstrata que serve como base para todos os serviços, definindo atributos comuns como nome, valor base, data e o pet atendido.

ServicoBanho.java, ServicoTosa.java, ServicoHospedagem.java, ServicoAdestramento.java, ServicoConsulta.java: Classes que herdam de Servico e implementam a lógica de cálculo de preço específica para cada tipo de serviço.

Como Executar o Projeto
Pré-requisitos: É necessário ter o JDK (Java Development Kit) instalado em seu computador.

Compilação: Navegue até a pasta src do projeto pelo terminal e compile todos os arquivos .java:

Bash

javac petshop/*.java
Execução: Após a compilação, ainda na pasta src, execute a classe Menu:

Bash

java petshop.Menu
Interação: O menu principal será exibido no console, e você poderá navegar pelas opções digitando os números correspondentes.

