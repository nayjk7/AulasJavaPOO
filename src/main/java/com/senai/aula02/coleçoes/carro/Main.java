package com.senai.aula02.coleçoes.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> ListaDeCarros = new ArrayList<>();

        System.out.println("Quantos carros deseja inserir no sistema:");
        int qntCarros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntCarros; i++){

            System.out.println("\nCarro" +(i+1)); //para comecar pelo carro 1 ao inves de zero
            System.out.println("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.println("Fabricante: ");
            String fabricante = scanner.nextLine();

            System.out.println("Cor: ");
            String cor = scanner.nextLine();

            System.out.println("Ano: ");
            int ano = scanner.nextInt();

            System.out.println("Valor: ");
            double valorInicial = scanner.nextDouble();

            scanner.nextLine();

            ListaDeCarros.add(new Carro(modelo,fabricante,cor,ano,valorInicial)); //passando para o arraylist - adicionando na lista

        }
        ListaDeCarros.forEach(System.out::println);  //mostrar a lista  // o forEach vai no primeiro carro e passa como parametro
    }
}
