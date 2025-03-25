package com.senai.Exercícios_Aula04.SistemaGestãoDePedidos;

public class PedidoOnline extends Pedido{
    private double taxaDeEntrega;

    public PedidoOnline(int numeroPedido, double valorTotal, double taxaDeEntrega) {
        super(numeroPedido, valorTotal);
        this.taxaDeEntrega = taxaDeEntrega;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de entrega: R$" + taxaDeEntrega);
    }
}

