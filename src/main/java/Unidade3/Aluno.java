package Unidade3;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        final double numeroAvaliacoes = 4;
        double nota1, nota2, nota3, nota4;
        int frequencia;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Informar nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Informar nota 3: ");
        nota3 = teclado.nextDouble();

        System.out.println("Informar nota 4: ");
        nota4 = teclado.nextDouble();

        System.out.println("Informar a frequencia: ");
        frequencia = teclado.nextInt();


        double media = (nota1+nota2+nota3+nota4)/numeroAvaliacoes;
        if((media < 5 || frequencia <75 )){
            System.out.println("Aluno reprovado");
        }else{
            System.out.println("Aluno aprovado");
        }

        System.out.println("Media: "+ media);

    }
}
