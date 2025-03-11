package com.senai.aula03.encapsulamento.Exercícios.cadastro_produtos_simples;

import java.util.Objects;

public class Produto {
    String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;

        } else {
            System.out.println("O preço do produto não pode ser negativo");
            System.out.println("O preço do produto vai ser atribuído como 0,00");

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;

        } else {
            System.out.println("O preço do produto não pode ser negativo");
        }
        }
        public void exibirProduto(){
            System.out.println("Produto: " + nome + "| Preço: R$" + preco);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
