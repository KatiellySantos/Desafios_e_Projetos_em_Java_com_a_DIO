## 🧩 Projeto Sudoku em Java

Este é um jogo de Sudoku feito em Java, jogado no console! O objetivo é completar o tabuleiro com números de 1 a 9 sem repetir valores em linhas, colunas ou blocos 3x3. O jogo começa com algumas posições preenchidas aleatoriamente para você resolver 🧠✨

---

## ✅ Funcionalidades

- Geração aleatória de números válidos no tabuleiro.

- Impressão organizada do tabuleiro no terminal.

- Interação com o usuário via teclado.

- Validação de jogadas (linha, coluna e bloco).

- Verificação de vitória ao completar o tabuleiro.

- Opção de sair do jogo a qualquer momento.
  
---

## 👨‍🏫 Passo a passo do código

1️⃣ Inicialização do Tabuleiro

- O tabuleiro é uma matriz 9x9 (int[][] tabuleiro).

- Começa todo zerado.

- A função gerarTabuleiroAleatorio(quantidade) preenche aleatoriamente algumas posições com números válidos.

2️⃣ Geração Aleatória

- A cada tentativa, é escolhida uma posição vazia.

- Um número aleatório de 1 a 9 é testado usando podeColocarNumero().

- Se válido, é inserido no tabuleiro.

3️⃣ Impressão no Console

- O método imprimirTabuleiro() mostra o tabuleiro com divisórias.

- Números vazios são exibidos como . para facilitar a leitura visual.

4️⃣ Jogada do Usuário

- O programa pede linha, coluna e número.

- Se digitar 0, o jogo encerra.

- A jogada é validada e, se correta, é inserida no tabuleiro.

5️⃣ Verificação de Vitória

- Após cada jogada válida, o jogo checa se o tabuleiro está completo com tabuleiroCompleto().

- Se estiver, uma mensagem de parabéns é exibida 🎉

## ▶️ Como executar

   1. Salve o arquivo como Sudoku.java
      ```bash
      javac Sudoku.java

   2. Compile:
      ```bash
      javac Sudoku.java

   3. Execute:
      ```bash
      java Sudoku

   4. Siga as instruções no console para jogar
