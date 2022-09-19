package Unidade3;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        final double numeroAvaliacoes = 4;
        double nota1, nota2, nota3, nota4;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Informar nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Informar nota 3: ");
        nota3 = teclado.nextDouble();

        System.out.println("Informar nota 4: ");
        nota4 = teclado.nextDouble();


        double media = (nota1+nota2+nota3+nota4)/numeroAvaliacoes;
        if(media < 5){
            System.out.println("Aluno reprovado");
        }

        System.out.println("Media: "+ media);

    }
}
