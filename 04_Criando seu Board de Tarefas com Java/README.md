# 🗂️ Board de Tarefas com Java

Este é um projeto prático de um **quadro de tarefas (estilo Kanban)** feito em Java, onde é possível adicionar, listar, mover e remover tarefas com diferentes status e prioridades.

## 🚀 Funcionalidades

- ✅ Adicionar tarefas com título, descrição e prioridade
- 📌 Mover tarefas entre os status: A FAZER, EM ANDAMENTO e CONCLUÍDA
- 📋 Listar tarefas por status ou exibir todas
- ❌ Remover tarefas por título

## 🧰 Tecnologias Usadas

- Java 17+ 🧠
- Paradigma de Programação Orientado a Objetos 💡
- Scanner para entrada de dados pelo terminal

## 🏗️ Estrutura do Projeto

```
board-tarefas-java/
├── src/
│   ├── models/
│   │   ├── Tarefa.java
│   │   ├── Status.java
│   │   └── Prioridade.java
│   ├── services/
│   │   └── QuadroTarefas.java
│   └── Main.java
└── README.md
```

## 🖥️ Como Executar

1. Compile os arquivos
```bash
javac src/Main.java src/models/*.java src/services/*.java
```
2. Execute o projeto
```bash
java -cp src Main
```

## 🤓 Sobre o Projeto

Este projeto foi desenvolvido como desafio da plataforma DIO, com o objetivo de reforçar conceitos fundamentais de Java. Ideal para quem está praticando POO, enums e manipulação de listas.

