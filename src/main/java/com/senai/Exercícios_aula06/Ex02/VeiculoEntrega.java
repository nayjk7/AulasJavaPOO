package com.senai.Exercícios_aula06.Ex02;

public abstract class VeiculoEntrega {
    protected double velocidadeAtual;
    protected double capacidadeMaximaCarga;
    protected double distanciaDestino;

    public VeiculoEntrega(double velocidadeAtual, double capacidadeMaximaCarga, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        this.distanciaDestino = distanciaDestino;
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void verificarDistancia() {
        System.out.println("Distância até o destino: " + distanciaDestino + " km");
    }

    public abstract double calcularTempoEntrega();
}

