package com.senai.Exercícios_Aula04.ControleDeEstoque;

public class Eletronico extends Produto {
    private double voltagem;

    public Eletronico(String nome, double preço, int quantidade, double voltagem) {
        super(nome, preço, quantidade);
        this.voltagem = voltagem;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Voltagem:" + voltagem);
    }
}
