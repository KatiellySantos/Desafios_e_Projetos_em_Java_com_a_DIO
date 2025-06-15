package Java;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    private static final int TAMANHO = 9;
    private static int[][] tabuleiro = new int[TAMANHO][TAMANHO];
    private static Random random = new Random();

    public static void main(String[] args) {
        gerarTabuleiroAleatorio(20);  // Tenta preencher 20 posições com números válidos
        Scanner sc = new Scanner(System.in);

        while (true) {
            imprimirTabuleiro();
            System.out.println("Digite linha (1-9), coluna (1-9) e "
            		+ "\nnúmero (1-9) para jogar, ou 0 para sair:");
            int linha = sc.nextInt();
            if (linha == 0) break;
            int coluna = sc.nextInt();
            int numero = sc.nextInt();

            if (linha < 1 || linha > 9 || coluna < 1 || coluna > 9 || numero < 1 || numero > 9) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            if (tabuleiro[linha - 1][coluna - 1] != 0) {
                System.out.println("Essa posição já está preenchida. Tente outra.");
                continue;
            }

            if (podeColocarNumero(linha - 1, coluna - 1, numero)) {
                tabuleiro[linha - 1][coluna - 1] = numero;
            } else {
                System.out.println("Jogada inválida! Número repete na linha, coluna ou bloco.");
            }

            if (tabuleiroCompleto()) {
                System.out.println("Parabéns! Você completou o Sudoku.");
                imprimirTabuleiro();
                break;
            }
        }

        sc.close();
    }

    private static void gerarTabuleiroAleatorio(int quantidade) {
        int preenchidos = 0;
        while (preenchidos < quantidade) {
            int linha = random.nextInt(TAMANHO);
            int coluna = random.nextInt(TAMANHO);
            if (tabuleiro[linha][coluna] == 0) {
                int numero = random.nextInt(9) + 1;
                if (podeColocarNumero(linha, coluna, numero)) {
                    tabuleiro[linha][coluna] = numero;
                    preenchidos++;
                }
            }
        }
    }

    private static void imprimirTabuleiro() {
        System.out.println("Tabuleiro Sudoku:");
        for (int i = 0; i < TAMANHO; i++) {
            if (i % 3 == 0) System.out.println("-------------------------");
            for (int j = 0; j < TAMANHO; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(tabuleiro[i][j] == 0 ? ". " : tabuleiro[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }

    private static boolean podeColocarNumero(int linha, int coluna, int numero) {
        for (int i = 0; i < TAMANHO; i++) {
            if (tabuleiro[linha][i] == numero) return false;
        }
        for (int i = 0; i < TAMANHO; i++) {
            if (tabuleiro[i][coluna] == numero) return false;
        }
        int blocoLinha = (linha / 3) * 3;
        int blocoColuna = (coluna / 3) * 3;
        for (int i = blocoLinha; i < blocoLinha + 3; i++) {
            for (int j = blocoColuna; j < blocoColuna + 3; j++) {
                if (tabuleiro[i][j] == numero) return false;
            }
        }
        return true;
    }

    private static boolean tabuleiroCompleto() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (tabuleiro[i][j] == 0) return false;
            }
        }
        return true;
    }
}


