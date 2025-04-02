package com.senai.aula06_abstração.exemplo_interface.veículo;

public class Carro implements Veículo {

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
}
