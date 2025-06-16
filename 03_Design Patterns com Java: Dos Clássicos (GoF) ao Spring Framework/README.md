# 💡 Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

Este projeto foi desenvolvido como parte do desafio **"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"**, com o objetivo de aplicar o padrão de projeto **Singleton** de forma prática e didática.

---

## 🧠 Sobre o Padrão Singleton

O padrão Singleton garante que apenas uma instância de uma classe seja criada e fornecida a todas as partes do código que precisarem dela. É muito utilizado em situações onde precisamos de uma configuração global ou controle centralizado.

---

## ⚙️ O que foi feito

Neste projeto simples, criamos uma classe chamada `Configuracao`, responsável por armazenar informações do sistema (nome e versão). A classe foi implementada com o padrão Singleton para garantir que exista somente uma instância.

---

## 🚀 Passo a passo do projeto

1. **Criação da classe Singleton**
   - Criamos a classe `Configuracao` com um construtor privado.
   - Utilizamos um método `getInstance()` para garantir uma única instância.

2. **Configuração dos dados**
   - A classe armazena o nome e a versão do sistema.
   - Permite alterar os valores e garante que as mudanças reflitam em toda a aplicação.

3. **Classe principal (Main)**
   - Instanciamos a `Configuracao` e alteramos a versão do sistema.
   - Mostramos que a segunda "instância" acessada é, na verdade, a mesma.

---

## 📁 Estrutura de pastas
  
   ![image](https://github.com/user-attachments/assets/39667b07-67f2-4bdc-9909-95e7cf4f8100)

---

## ▶️ Como executar

1. Compile os arquivos:
   ```bash
   javac com/carla/singleton/*.java

2. Execute a classe principal:
   ```bash
   java com.carla.singleton.Main

---

## ✅ Saída esperada
   ```bash
Sistema: Sistema de Cadastro
Versão: 1.0.0
Versão (segunda instância): 1.1.0


