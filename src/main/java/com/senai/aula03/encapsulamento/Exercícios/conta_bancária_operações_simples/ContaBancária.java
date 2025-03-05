package com.senai.aula03.encapsulamento.Exercícios.conta_bancária_operações_simples;

public class ContaBancária {
    private String titular;
    private double saldo;

    public ContaBancária(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor<= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!" +
                    "\nValor atual: R$" + saldo);
        }else System.out.println("Saldo insuficiente");

        }

    @Override
    public String toString() {
        return "ContaBancária{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


