package com.senai.Exercícios_aula06.Ex02;

public class Main {
    public static void main(String[] args) {
        VeiculoEntrega moto = new MotoEntrega(60, 30, 12);
        VeiculoEntrega bike = new BicicletaEntrega(20, 10, 5);

        moto.verificarVelocidade();
        System.out.println("Tempo estimado (moto): " + moto.calcularTempoEntrega() + " horas");

        bike.verificarDistancia();
        System.out.println("Tempo estimado (bike): " + bike.calcularTempoEntrega() + " horas");
    }

}
