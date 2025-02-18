package com.senai.Exercícios_Aula01.CadastroProduto;

public class Produto {
    String nome;
    double preço;
    int quantidade;

    public Produto (String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade= quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome:" +nome);
        System.out.println("Preço: R$" +preço);
        System.out.println("Quantidade em estoque:" +quantidade);
        System.out.println("-------------------------");

    }
    public void atualizaEstoque(int valor) {
        this.quantidade += valor;
    }

    public double calcularValorEstoque(){
        return preço * quantidade;

    }
}
