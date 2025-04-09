package com.senai.Exercícios_aula06.ControleDeEntrega;

public abstract class Veículo {
    double velocidadeAtual;
    double capacidadeCarga;

    public Veículo(double velocidadeAtual, double capacidadeCarga) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeCarga = capacidadeCarga;
    }

    abstract void calcularTempoEntrega();

    void exibirDetalhes() {
        System.out.println("velocidade atual:" + velocidadeAtual + "\ncapacidade de carga" + capacidadeCarga);
    }
}
