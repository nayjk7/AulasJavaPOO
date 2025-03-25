package com.senai.Exercícios_Aula04.SistemaDeBibliotecas;

public class LivroFisico extends Livro{
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}



