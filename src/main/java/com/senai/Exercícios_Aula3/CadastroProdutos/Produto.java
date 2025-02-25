package com.senai.Exercícios_Aula3.CadastroProdutos;

public class Produto {
    private String nome;
    private double preco;

  public Produto(String nome) {
      this.nome = nome;
      this.preco = preco;

  }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
      if (preco >= 0) {
      this.preco = preco;
    } else {
          System.out.println("Preço inválido!!");
      }
}

}
