package com.senai.Exercícios_Aula04.SistemaGestãoDePedidos;

public class Main {
    public static void main(String[] args) {
    Pedido pedido1 = new PedidoOnline(1, 300, 15);
    Pedido pedido2 = new PedidoOnline(2, 450, 12);

    Pedido pedido3 = new PedidoPresencial(3, 250, 10);
    Pedido pedido4 = new PedidoPresencial(4, 500, 0);


        System.out.println("Detalhes dos pedidos online:");
        pedido1.exibirDetalhes();
        System.out.println();
        pedido2.exibirDetalhes();

        System.out.println();

        System.out.println("Detalhes dos pedidos presenciais:");
        pedido3.exibirDetalhes();
        System.out.println();
        pedido4.exibirDetalhes();
    }

}
