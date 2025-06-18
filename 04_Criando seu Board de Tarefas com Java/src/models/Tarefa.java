package models;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Status status;
    private Prioridade prioridade;

    public Tarefa(String titulo, String descricao, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.A_FAZER;
        this.prioridade = prioridade;
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public Status getStatus() { return status; }
    public Prioridade getPrioridade() { return prioridade; }

    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return "[" + status + "] " + titulo + " (" + prioridade + ") - " + descricao;
    }
}
