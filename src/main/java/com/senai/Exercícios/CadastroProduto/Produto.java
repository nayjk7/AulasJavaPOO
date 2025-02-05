package com.senai.Exercícios.CadastroProduto;

public class Produto {
    String nome;
    double preço;
    int quantidadeInicial;

    public Produto (String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidadeInicial = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + "\nPreço:" + this.preço + "\nQuantidade: " + this.quantidadeInicial + "\n");

    }

    public void atualizaEstoque() {


    }
}
