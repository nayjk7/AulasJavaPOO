package com.senai.Exercícios_aula06.Ex03;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao("João", 150.00);
        Pagamento pix = new PagamentoPix("Maria", 85.50);

        cartao.executarTransacao();
        System.out.println("---");
        pix.executarTransacao();
    }

}
