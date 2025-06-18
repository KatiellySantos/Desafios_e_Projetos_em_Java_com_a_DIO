package services;

import models.*;
import java.util.*;

public class QuadroTarefas {
    private List<Tarefa> tarefas;

    public QuadroTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!\n");
    }

    public void listarTarefasPorStatus(Status status) {
        System.out.println("--- Tarefas: " + status + " ---");
        for (Tarefa t : tarefas) {
            if (t.getStatus() == status) {
                System.out.println(t);
            }
        }
        System.out.println();
    }

    public void moverTarefa(String titulo, Status novoStatus) {
        for (Tarefa t : tarefas) {
            if (t.getTitulo().equalsIgnoreCase(titulo)) {
                t.setStatus(novoStatus);
                System.out.println("Tarefa atualizada!\n");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.\n");
    }

    public void removerTarefa(String titulo) {
        tarefas.removeIf(t -> t.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Tarefa removida (se existia).\n");
    }

    public void listarTodas() {
        System.out.println("--- Todas as Tarefas ---");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
        System.out.println();
    }
}
