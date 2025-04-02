package com.senai.aula06_abstração.exemplo_interface.aparelhoEletronico;

public class televisão implements aparelho{
    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }
}
