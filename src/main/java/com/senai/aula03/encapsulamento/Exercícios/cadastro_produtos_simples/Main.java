package com.senai.aula03.encapsulamento.Exercícios.cadastro_produtos_simples;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("feijão", 10);

        Produto produto2 = new Produto("arroz", 20);

        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setPreco(-10);

        produto1.setNome("feijão");
        produto1.setPreco(10);

        produto1.exibirProduto();

    }
}
