package com.senai.Exercícios_Aula01.CadastroProduto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Arroz",
                15.0,
                50
        );
        Produto produto2 = new Produto(
                "Feijão",
                7.99,
                30

        );
        produto1.atualizaEstoque(10);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();


        System.out.println("Valor total do estoque de" +produto1.nome +": R$" +produto1.calcularValorEstoque());
        System.out.println("Valor total do estoque de" +produto2.nome +": R$" +produto2.calcularValorEstoque());

    }

}
