package com.senai.aula04.herança.exemplos.veículo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2022, 4);
        Moto moto = new Moto("Honda", 2023, true);

        System.out.println("Detalhes do carro: ");
        carro.exibirDetalhes();

        System.out.println("Detalhes da moto:");
        moto.exibirDetalhes();

    }
}
