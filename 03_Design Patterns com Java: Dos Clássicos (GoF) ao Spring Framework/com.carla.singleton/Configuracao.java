package com.carla.singleton;

public class Configuracao {
    private static Configuracao instancia;

    private String nomeSistema;
    private String versao;

    private Configuracao() {
        this.nomeSistema = "Sistema de Cadastro";
        this.versao = "1.0.0";
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}

