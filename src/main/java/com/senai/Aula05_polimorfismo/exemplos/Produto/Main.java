package com.senai.Aula05_polimorfismo.exemplos.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijão");
        Produto produto2 = new Produto("Arroz", 25.5);
        Produto produto3 = new Produto("Macarrão", 5, 15);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}
