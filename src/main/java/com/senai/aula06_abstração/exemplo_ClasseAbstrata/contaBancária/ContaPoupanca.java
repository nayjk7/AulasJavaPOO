package com.senai.aula06_abstração.exemplo_ClasseAbstrata.contaBancária;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void taxaMensal() {
        saldo += saldo * 0.005;
    }
}

