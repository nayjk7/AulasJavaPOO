package com.senai.Exercícios_Aula04.SistemaGestãoDePedidos;

public class PedidoPresencial extends Pedido {
   private double descontoAVista;

    public PedidoPresencial(int numeroPedido, double valorTotal, double descontoAVista) {
        super(numeroPedido, valorTotal);
        this.descontoAVista = descontoAVista;
    }
    public double CalcularValorFinal(){
        return getValorTotal() - (getValorTotal() * descontoAVista/100);
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto para pagamento à vista:" + descontoAVista + "%");
        System.out.println("Valor final com desconto: R$" + CalcularValorFinal());
    }
}


