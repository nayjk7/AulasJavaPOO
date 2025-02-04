package com.senai.exemplos.Concessionaria;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int ano;
    double valorInicial;


    public Carro(String modelo, String fabricante, String cor, int ano, double valor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.valorInicial = valor;
    }

    public void testeDriver(){
        System.out.println("vrummm!" +modelo + "ligado.");

    }
    public void comprar(String nomeCliente){
        System.out.println("Parabéns " +nomeCliente+ "você comprou o " +modelo);
    }
    public void valorTabelaFipe(int anoAtual){
        double valorFinal = valorInicial;
        int idade = anoAtual - ano;

        for(int i = 0; i < idade; i++) {
            valorFinal -= (valorFinal*0.02);
        }
        System.out.println("Valor atual do veículo" +modelo+ "com desvalorização de 2% ao ano será de R$"+String.format("%.2f", valorFinal));
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", valor=" + valorInicial +
                '}';
    }
}

