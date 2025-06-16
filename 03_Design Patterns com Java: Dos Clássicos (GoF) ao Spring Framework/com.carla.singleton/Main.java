package com.carla.singleton;

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        System.out.println("Sistema: " + config1.getNomeSistema());
        System.out.println("Versão: " + config1.getVersao());

        config1.setVersao("1.1.0");

        Configuracao config2 = Configuracao.getInstance();
        System.out.println("Versão (segunda instância): " + config2.getVersao());
    }
}

