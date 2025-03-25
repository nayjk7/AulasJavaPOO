package com.senai.Exercícios_Aula04.SistemaDeBibliotecas;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new LivroFisico("Jantar Secreto", "Raphael Montes", 362 );
        Livro livro2 = new LivroFisico("Caraval", "Stephanie Garber", 352);
        Livro livro3 = new LivroDigital("Confesse", "Colleen Hoover", 5);
        Livro livro4 = new LivroDigital("Táticas do Amor", "Sarah Adams", 2);

        System.out.println("Detalhe dos livros físicos");
        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();

        System.out.println();

        System.out.println("Detalhe dos livros digitais");
        livro3.exibirDetalhes();
        System.out.println();
        livro4.exibirDetalhes();
    }

}
