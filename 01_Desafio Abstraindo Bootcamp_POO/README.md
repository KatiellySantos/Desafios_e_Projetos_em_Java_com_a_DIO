## Abstraindo um Bootcamp Usando Orientação a Objetos em Java

Este projeto tem como objetivo aplicar os princípios da Programação Orientada a Objetos (POO) em Java por meio da abstração de um sistema de bootcamp. Nele, são criadas entidades como cursos, mentorias e desenvolvedores, simulando a estrutura de uma plataforma de aprendizagem.

A proposta segue os quatro pilares da POO:

  - Abstração: Representação das entidades reais do domínio educacional (Curso, Mentoria, Bootcamp, Dev);

  - Encapsulamento: Atributos privados com acesso controlado por métodos (get e set);

  - Herança: As classes Curso e Mentoria herdam da classe abstrata Conteudo;

  - Polimorfismo: Cada tipo de conteúdo implementa seu próprio cálculo de XP, sobrescrevendo o método calcularXp.

---

## 🛠️ Tecnologias Utilizadas

  - Java 17 (ou superior)

  - IDE sugerida: Visual Studio Code, IntelliJ ou Eclipse

  - Terminal para compilação manual com javac e java

---  

## 📦 Estrutura do Projeto

O projeto está organizado em uma única classe principal com as demais classes declaradas no mesmo arquivo para facilitar testes e execução rápida:

  - Conteudo (classe abstrata base)

  - Curso (herda de Conteudo)

  - Mentoria (herda de Conteudo)

  - Bootcamp (contém uma coleção de conteúdos e devs inscritos)

  - Dev (representa o aluno)

  - AbstraindoBootcampPOO (classe principal main com simulação de uso)

---

## ▶️ Como Executar

✔️ Passo a passo:

   1. Copie o código para um arquivo chamado AbstraindoBootcampPOO.java.

   2. Compile o arquivo no terminal:
      ```bash
      javac AbstraindoBootcampPOO.java

   3. Execute o programa:
      ```bash
      java AbstraindoBootcampPOO

---

## 📈 Funcionalidades Demonstradas

  - Criação de cursos e mentorias

  - Inscrição de desenvolvedor no bootcamp

  - Progresso automático no conteúdo (ordem de inscrição)

  - Cálculo de XP acumulado

  - Saída no console com progresso e conteúdos concluídos

---

## ✅ Objetivos de Aprendizado

  - Compreender e aplicar os conceitos de POO na prática;

  - Criar e manipular coleções em Java (Set, LinkedHashSet);

  - Utilizar o Optional de forma segura para fluxo de controle;

  - Trabalhar com datas utilizando LocalDate.
