package com.senai.Exercícios_aula06.Ex03;
public class PagamentoPix extends Pagamento {
    public PagamentoPix(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via PIX...");
    }
}