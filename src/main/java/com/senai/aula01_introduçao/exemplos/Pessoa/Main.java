package com.senai.aula01_introduçao.exemplos.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Nay", 19 );
        Endereco endereco = new Endereco("Pau Darco Roxo", 22, "Jardim Pedro José Nunes", "SP", "SP");
        Scanner scanner = new Scanner(System.in);
        String cabecalho[] = {"Nome: ", "Idade:", "Altura:", "Endereço: \n\trua:",
                "\tnúmero:", "\tbairro:", "\tcidade:", "\testado:"}; //string que mostra na tela do usuário
        String dados[] = new String[8]; //string que armazena os dados

        System.out.println("Preencha as informações a seguir: ");
        for (int i = 0; i < cabecalho.length; i++ ){
            System.out.println(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }

     Pessoa pessoa2 = new Pessoa( //construção do objeto
             dados[0],
             Integer.parseInt(dados[1]),
             Float.parseFloat(dados[2]),
             new Endereco(
                     dados[3],
                     Integer.parseInt(dados[4]),
                     dados[5],
                     dados[6],
                     dados[7]
             )
     );

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("cenoura");
        pessoa2.comer("abóbora");
    }
}
