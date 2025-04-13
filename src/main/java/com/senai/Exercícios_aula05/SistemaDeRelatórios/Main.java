package com.senai.Exercícios_aula05.SistemaDeRelatórios;

public class Main {
    public static void main(String[] args) {
               Relatorio PDF = new PDF();
               Relatorio CSV = new CSV();
               Relatorio JSON = new JSON();

        PDF.gerar();
        CSV.gerar();
        JSON.gerar();
    }
}