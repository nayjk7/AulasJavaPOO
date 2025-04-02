package com.senai.aula06_abstração.exemplo_ClasseAbstrata.contaBancária;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Nay",10000));
        testarContas(new ContaPoupanca("Dani", 30000));

    }
    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.taxaMensal();
        contaBancaria.exibirSaldo();
    }
}
