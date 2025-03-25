package com.senai.Exercícios_Aula04.SistemaGestãoDePedidos;

public class Pedido {
    private int numeroPedido;
    private double valorTotal;

    public Pedido(int numeroPedido, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    void exibirDetalhes(){
        System.out.println("Número do pedido: " + numeroPedido + "\nValor total: R$" +valorTotal);
    }
}

