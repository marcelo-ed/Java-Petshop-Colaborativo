# 🐾 Sistema de Gestão de Pet Shop  
### Projeto de Programação Orientada a Objetos (Java)

---

## 📘 Descrição Geral

O **Sistema de Gestão de Pet Shop** é uma aplicação desenvolvida em **Java**, com o objetivo de gerenciar **clientes, pets e serviços** oferecidos por um pet shop.  
O sistema foi estruturado com base nos princípios da **Programação Orientada a Objetos (POO)**, garantindo **modularidade**, **reutilização de código** e **fácil manutenção**.  

O programa é executável no **Eclipse IDE**, com interação via **menu no console**.

---

## 🧠 Objetivos do Sistema

O sistema foi projetado para atender as principais demandas de um pet shop:

- 🧍‍♂️ **Cadastro de Clientes**: incluir, consultar, buscar e excluir;  
- 🐶 **Cadastro de Pets**: incluir, consultar, buscar e excluir;  
- 🧼 **Cadastro de Serviços**: incluir, consultar, buscar e excluir (banho, tosa, hospedagem, adestramento e consulta);  
- 🎁 **Cadastro de Pacotes de Serviços**;  
- 🔗 **Vinculação de pets a clientes** e controle de serviços contratados;  
- 🛑 **Validações** completas de campos obrigatórios e tipos de dados;  
- ⚖️ **Regras de negócio** que impedem inconsistências no sistema.

---

## 🏗️ Estrutura do Projeto (Classes)

| Classe | Função Principal |
|--------|------------------|
| `Cliente.java` | Representa o cliente do pet shop, contendo dados pessoais e a lista de pets. |
| `Pet.java` | Modela o pet, com nome, espécie, raça, idade e vínculo com o dono (Cliente). |
| `Servico.java` | Classe abstrata base para os serviços do pet shop. |
| `ServicoBanho.java` | Especialização da classe `Servico` — serviço de banho. |
| `ServicoTosa.java` | Especialização da classe `Servico` — serviço de tosa. |
| `ServicoHospedagem.java` | Especialização da classe `Servico` — serviço de hospedagem. |
| `ServicoConsulta.java` | Especialização da classe `Servico` — serviço de consulta veterinária. |
| `ServicoAdestramento.java` | Especialização da classe `Servico` — serviço de adestramento. |
| `RepositorioPets.java` | Armazena e gerencia listas de clientes, pets e serviços. |
| `Menu.java` | Controla o fluxo do programa e exibe as opções interativas no console. |

---

## 📋 Regras de Negócio Implementadas

1. 🔗 Cada **pet** está vinculado a **um único cliente**.  
2. 💰 Um **cliente só pode contratar serviços para seus próprios pets**.  
3. ❌ **Clientes ou pets com serviços ativos não podem ser excluídos.**  
4. 📦 Clientes podem **cancelar serviços** ou **pacotes** já contratados.  
5. ✅ Todos os cadastros verificam **campos obrigatórios**, **tipo de dado** e **tamanho máximo permitido**.

---

## 🧱 Validação de Dados

O sistema faz validação de todas as informações inseridas pelo usuário:

- ❗ **Campos obrigatórios** — nome, CPF, espécie, serviço, etc.  
- 🔢 **Tipo de dado** — impede letras onde deve haver números.  
- ✏️ **Tamanho máximo** — evita entrada excessiva de caracteres.

---

## 🖥️ Como Executar o Sistema

### 🔧 Pré-requisitos
- Java **JDK 17+**
- **Eclipse IDE** (ou qualquer IDE Java)

### ▶️ Passos para execução
1. Abra o **Eclipse**.  
2. Crie um **novo projeto Java**.  
3. Importe todos os arquivos `.java` fornecidos.  
4. Verifique se o método `main` da classe **`Menu.java`** está configurado como principal.  
5. Clique em **Run ▶ Java Application**.  

O menu será exibido no console com as opções do sistema.

---

## 🧭 Menu Principal

```
===== PET SHOP SYSTEM =====
1 - Cadastrar Cliente
2 - Cadastrar Pet
3 - Cadastrar Serviço
4 - Cadastrar Pacote
5 - Consultar Registros
6 - Buscar por Nome
7 - Excluir Registro
0 - Sair
============================
Escolha uma opção:
```

---

## 📚 Manual de Uso

### 🧍 Cadastro de Cliente
- Informe nome, CPF, telefone e endereço.  
- O sistema valida todos os campos antes de cadastrar.

### 🐾 Cadastro de Pet
- Informe nome, espécie, raça e vincule a um cliente já existente.  

### 🧼 Contratar Serviço
- Escolha o tipo (banho, tosa, hospedagem, etc.).  
- Selecione o pet e o cliente vinculados.  

### 📦 Pacotes de Serviços
- Combine vários serviços em um mesmo pacote.  

### ❌ Exclusões
- Só é possível excluir **clientes/pets sem serviços ativos**.  

---

## 🧩 Diagrama de Classes (UML Simplificado)

```
          +----------------+
          |    Servico     |
          +----------------+
          | descricao      |
          | valor          |
          +----------------+
          | executar()     |
          +----------------+
                 ^
   -----------------------------------------------
   |        |           |           |            |
+------+ +--------+ +------------+ +----------------+
|Banho | |Tosa   | |Hospedagem  | |Adestramento    |
+------+ +--------+ +------------+ +----------------+

+----------------+        +----------------+
|    Cliente     |<>------|      Pet       |
+----------------+        +----------------+
| nome, cpf, ... |        | nome, especie  |
+----------------+        +----------------+

+--------------------+
| RepositorioPets    |
+--------------------+
| clientes, pets,... |
+--------------------+

+--------------------+
|       Menu         |
+--------------------+
| main()             |
+--------------------+
```

---

## 🧹 Organização e Qualidade do Código

- Uso de **Herança**, **Polimorfismo** e **Encapsulamento**.  
- Código **modularizado e coeso**.  
- Métodos **bem nomeados** e de **responsabilidade única**.  
- Estrutura dividida em **modelo**, **repositório** e **interface**.  

---

## 👨‍💻 Autores

- **Guilherme Eduardo Rodrigues Krinski**  
- **Marcelo Eduardo Silva e Santos Lopes**  
- **Pedro Saldanha Santana**  

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos**  

---

## 🏁 Conclusão

Este projeto demonstra com clareza os conceitos de **Programação Orientada a Objetos** aplicados na prática.  
A aplicação utiliza **herança, abstração, polimorfismo e encapsulamento**, além de respeitar **regras de negócio reais** e boas práticas de desenvolvimento em Java.  

---
