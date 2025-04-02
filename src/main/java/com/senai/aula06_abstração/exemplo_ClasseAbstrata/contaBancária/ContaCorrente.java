package com.senai.aula06_abstração.exemplo_ClasseAbstrata.contaBancária;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void taxaMensal() {
        saldo -= 20.0;
    }
}

