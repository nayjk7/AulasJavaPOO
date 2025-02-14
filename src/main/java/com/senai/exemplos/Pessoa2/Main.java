package com.senai.exemplos.Pessoa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Nayara", 19);
        Pessoa pessoa2 = new Pessoa("Daniele", 16);
        Pessoa pessoa3 = new Pessoa("Celia", 54);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas){
            System.out.println(pessoa);
        }

        matrizPessoas[0].falar("oii");
        matrizPessoas[3] = new Pessoa("Victor", 30); //criar direto na matriz

        System.out.println(matrizPessoas[3].nome);

        ArrayList lista = new ArrayList();
        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("Jungkook", 28));

        System.out.println("tamanho da lista: " +listaPessoas.size());
        listar(listaPessoas);


        listaPessoas.set(0,pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0,pessoa3);
        listar(listaPessoas);


        System.out.println("__________teste____________");

        listaPessoas.forEach(System.out::println);

        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.nome.toLowerCase().contains("J")).toList(); //retorna uma lista dos objetos específicos que vc está procurando na lista(filtragem)
        System.out.println("----------teste filtro---------------");
        listaFiltrada.forEach(System.out::println);
    }

    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("\n--------Lista--------");
        for (Pessoa pessoa: lista){
            System.out.println(pessoa);
        }
        System.out.println("----------------------------");

    }
}
