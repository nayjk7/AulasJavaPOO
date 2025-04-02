package com.senai.aula06_abstração.exemplo_interface.aparelhoEletronico;

public class computador implements aparelho{
    @Override
    public void ligar() {
        System.out.println("computador");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }
}
