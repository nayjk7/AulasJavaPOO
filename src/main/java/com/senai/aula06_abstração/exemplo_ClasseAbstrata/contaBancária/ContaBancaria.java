package com.senai.aula06_abstração.exemplo_ClasseAbstrata.contaBancária;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    abstract void taxaMensal();

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            mensagemDeSucesso("Saque", this);
            return true;
        } else {
            System.out.println(" saldo insuficiente ");
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            mensagemDeSucesso("depositar", this);
            return true;
        } else {
            System.out.println(" Operação invalída: o valor do deposito." +
                    "deve ser maior que R$0,0");
            return false;
        }
    }

    public static void mensagemDeSucesso(String operacao, ContaBancaria minhaConta) {
        System.out.println(operacao + " na conta do " + minhaConta.titular + " realizado com sucesso ");
        System.out.println("saldo atual R$" + minhaConta.saldo);
    }

    public void exibirSaldo() {
        System.out.printf(" Titular: %s\n,Saldo: R$%.2f\n ", titular, saldo);
    }
}



