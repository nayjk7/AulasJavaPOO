package com.senai.aula03.encapsulamento.Exercícios.conta_bancária_operações_simples;

public class ContaBancária {
    private String titular;
    private double saldo;

    public ContaBancária(String titular, double saldo){
        this.titular = titular;
        if(saldo>=0) {
            this.saldo = saldo;
        }else {
            System.out.println("O saldo não pode iniciar negativo, será atribuído" +
                    "ao saldo o seguinte valor: R$0,0");
        }
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

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!" +
                    "\nValor atual: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public boolean depositar(double valor){
        if(valor>0){
            saldo += valor;
            mensagemDeSucesso("Depositar", this);
            return true;

        } else {
            System.out.println("Operação inválida: o valor do depósito" +
                    "deve ser maior que R$0,0");
            return false;
        }
    }

    public static void mensagemDeSucesso(String operacao, ContaBancária minhaConta){
        System.out.println(operacao + "para" + minhaConta.titular + "Realizado com sucesso:");
        System.out.println("Saldo atual: R$" + minhaConta.saldo);
    }
    public void transferencia(double valor, ContaBancária contaDestino){
        if(this.sacar(valor));
        contaDestino.depositar(valor);
    }
    @Override
    public String toString() {
        return "ContaBancária{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}





