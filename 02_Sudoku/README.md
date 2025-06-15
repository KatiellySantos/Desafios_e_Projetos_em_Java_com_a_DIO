## Projeto Sudoku em Java

Este projeto é uma implementação simples de um jogo Sudoku no console, em Java. O objetivo é fornecer um tabuleiro parcialmente preenchido aleatoriamente, onde o jogador pode inserir números válidos seguindo as regras do Sudoku.
Funcionalidades

    - Geração aleatória de um tabuleiro com números válidos em posições aleatórias.

    - Impressão do tabuleiro no console, com divisão visual dos blocos 3x3.

    - Entrada de jogadas pelo usuário, validando linhas, colunas e blocos.

    - Verificação automática de vitória quando o tabuleiro é completamente preenchido.

    - Permite ao usuário sair do jogo a qualquer momento digitando 0.

---

## Passo a passo do código

1. Inicialização do tabuleiro

    - O tabuleiro é representado por uma matriz 9x9 de inteiros (int[][] tabuleiro), inicialmente zerada.

    - O método gerarTabuleiroAleatorio(int quantidade) preenche o tabuleiro com uma quantidade definida de números aleatórios válidos.

2. Geração aleatória de números válidos

    - O método tenta preencher o tabuleiro com números aleatórios, verificando se cada número pode ser inserido naquela posição (linha, coluna e bloco 3x3).

    - Usa a função podeColocarNumero(linha, coluna, numero) para validar as jogadas.

    - Esse processo continua até que o número de posições preenchidas atinja a quantidade desejada (exemplo: 20).

3. Impressão do tabuleiro

    - O método imprimirTabuleiro() mostra o tabuleiro no console com linhas e colunas separadas para facilitar a visualização.

    - Números vazios são exibidos como pontos (.).

4. Entrada do usuário e validação

    - O programa pede que o usuário digite a linha, a coluna e o número que deseja inserir.

    - Entrada 0 na linha encerra o jogo.

    - O programa verifica se a posição está vazia e se o número é válido para aquela posição.

    - Caso a jogada seja válida, o número é inserido no tabuleiro; caso contrário, uma mensagem de erro é mostrada.

5. Verificação de vitória

    - Após cada jogada válida, o método tabuleiroCompleto() verifica se o tabuleiro está totalmente preenchido.

    - Se estiver, o programa parabeniza o jogador e encerra o jogo.

---

## Como executar

    Salve o arquivo como Sudoku.java.

    Compile no terminal com:
    javac Sudoku.java

    Execute o programa:
    java Sudoku

    Siga as instruções no console para jogar.