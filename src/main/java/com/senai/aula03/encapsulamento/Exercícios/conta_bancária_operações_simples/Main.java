package com.senai.aula03.encapsulamento.Exercícios.conta_bancária_operações_simples;

public class Main {
    public static void main(String[] args) {

        ContaBancária contaBancária1 = new ContaBancária("Nayara", 100);
        ContaBancária contaBancária2 = new ContaBancária("Daniele", 1000);

        System.out.println("---------teste sacar-----------");
        contaBancária1.sacar(-10);
        contaBancária1.sacar(110);
        contaBancária2.sacar(10);

        System.out.println("--------teste depositar---------");

        contaBancária1.depositar(-200);
        contaBancária1.depositar(200);

        System.out.println("--------teste tranferir---------");
        contaBancária2.transferencia(10, contaBancária1);
    }
}
