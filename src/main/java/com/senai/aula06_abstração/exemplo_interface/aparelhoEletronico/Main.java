package com.senai.aula06_abstração.exemplo_interface.aparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new televisão());
        testeAparelho(new computador());
    }
    private static void testeAparelho(aparelho aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}


