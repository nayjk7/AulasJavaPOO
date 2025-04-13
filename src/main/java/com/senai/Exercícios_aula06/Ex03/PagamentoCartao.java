package com.senai.Exercícios_aula06.Ex03;
public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito...");
    }
}