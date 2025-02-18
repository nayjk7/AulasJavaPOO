package com.senai.aula02.coleçoes.carro;

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

    @Override
    public String toString() {  //mostrar a lista no main
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", valorInicial=" + valorInicial +
                '}';
    }
}
