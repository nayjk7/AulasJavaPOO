package com.senai.Exercícios_Aula04.ControleDeEstoque;

public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    void exibirDetalhes(){
        System.out.println("Nome:" + nome + ", Preço: R$" + preço + ", Quantidade: " + quantidade);
    }
}
