package com.senai.Exercícios_Aula04.ControleDeEstoque;

public class Alimento extends Produto {
   private String dataValidade;

    public Alimento(String nome, double preço, int quantidade, String dataValidade) {
        super(nome, preço, quantidade);
        this.dataValidade = dataValidade;

    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Data de validade:" + dataValidade);
    }
}

