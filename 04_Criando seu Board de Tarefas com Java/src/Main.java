import models.*;
import services.QuadroTarefas;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadroTarefas quadro = new QuadroTarefas();

        while (true) {
            System.out.println("\n--- Board de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas por Status");
            System.out.println("3. Mover Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Listar Todas as Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();
                    System.out.print("Prioridade (BAIXA/MEDIA/ALTA): ");
                    Prioridade p = Prioridade.valueOf(scanner.nextLine().toUpperCase());
                    quadro.adicionarTarefa(new Tarefa(titulo, desc, p));
                }
                case 2 -> {
                    System.out.print("Status (A_FAZER/EM_ANDAMENTO/CONCLUIDA): ");
                    Status s = Status.valueOf(scanner.nextLine().toUpperCase());
                    quadro.listarTarefasPorStatus(s);
                }
                case 3 -> {
                    System.out.print("Título da Tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Novo Status (A_FAZER/EM_ANDAMENTO/CONCLUIDA): ");
                    Status s = Status.valueOf(scanner.nextLine().toUpperCase());
                    quadro.moverTarefa(titulo, s);
                }
                case 4 -> {
                    System.out.print("Título da Tarefa: ");
                    String titulo = scanner.nextLine();
                    quadro.removerTarefa(titulo);
                }
                case 5 -> quadro.listarTodas();
                case 0 -> {
                    System.out.println("Encerrando o programa...");
                    return;
                }
                default -> System.out.println("Opção inválida.\n");
            }
        }
    }
}
