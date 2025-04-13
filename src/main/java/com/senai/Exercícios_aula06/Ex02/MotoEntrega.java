package com.senai.Exercícios_aula06.Ex02;

public class MotoEntrega extends VeiculoEntrega {
    public MotoEntrega(double velocidadeAtual, double capacidadeMaximaCarga, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMaximaCarga, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        return (distanciaDestino / velocidadeAtual) * 1.2;
    }
}
