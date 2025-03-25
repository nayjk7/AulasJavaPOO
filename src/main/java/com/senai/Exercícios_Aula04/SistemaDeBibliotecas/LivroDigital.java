package com.senai.Exercícios_Aula04.SistemaDeBibliotecas;

public class LivroDigital extends Livro {
    private double tamanhoDoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoDoArquivo) {
        super(titulo, autor);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo: " + tamanhoDoArquivo + "MB");
    }
}
