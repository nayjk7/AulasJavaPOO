package com.senai.aula04.herança.exemplos.veículo;

public class Carro extends Veículo {
    int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }
    void exibirDetalhes(){
            super.exibirDetalhes();
        System.out.println("Portas: " + portas);

    }
}

