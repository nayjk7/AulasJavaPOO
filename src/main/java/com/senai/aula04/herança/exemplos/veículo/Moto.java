package com.senai.aula04.herança.exemplos.veículo;

public class Moto extends Veículo {
    boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida Elétrica: " + (temPartidaEletrica ? "Sim: " : "Não"));
    }
}
