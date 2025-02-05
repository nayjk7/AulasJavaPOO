package com.senai.Exercícios.CadastroProduto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Arroz",
                25.0,
                100
        );
        Produto produto2 = new Produto(
                "Macarrão",
                3.0,
                250

        );
        Produto produto3 = new Produto(
                "Feijão",
                7.0,
                150
        );

        System.out.println("Digite a quantidade atualizada do estoque");
    

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        produto3.exibirDetalhes();

    }

}
