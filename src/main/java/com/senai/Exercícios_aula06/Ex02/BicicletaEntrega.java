package com.senai.Exercícios_aula06.Ex02;

public class BicicletaEntrega extends VeiculoEntrega {
    public BicicletaEntrega(double velocidadeAtual, double capacidadeMaximaCarga, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMaximaCarga, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        // Bicicleta tem limite de velocidade
        double velocidadeMaxima = Math.min(velocidadeAtual, 25);
        return distanciaDestino / velocidadeMaxima;
    }
}