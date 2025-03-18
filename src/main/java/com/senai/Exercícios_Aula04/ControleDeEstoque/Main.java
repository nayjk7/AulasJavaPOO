package com.senai.Exercícios_Aula04.ControleDeEstoque;

public class Main {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Arroz", 15, 30, "26/09/2029");
        Alimento alimento2 = new Alimento("Macarrão", 3,25, "11/04/2026");
        Alimento alimento3 = new Alimento("Azeite", 35, 50, "05/02/2027");

        Eletronico eletronico1 = new Eletronico("Microondas", 700, 50, 220);
        Eletronico eletronico2 = new Eletronico("Secador de Cabelo", 300, 25, 110);
        Eletronico eletronico3 = new Eletronico("Liquidificador", 450, 20, 110);

        System.out.println("Estoque alimentos:");
        alimento1.exibirDetalhes();
        alimento2.exibirDetalhes();
        alimento3.exibirDetalhes();

        System.out.println();

        System.out.println("Estoque eletrônicos");
        eletronico1.exibirDetalhes();
        eletronico2.exibirDetalhes();
        eletronico3.exibirDetalhes();


    }
}
