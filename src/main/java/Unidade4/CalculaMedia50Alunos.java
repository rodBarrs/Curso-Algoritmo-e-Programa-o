package Unidade4;

import java.util.Scanner;

public class CalculaMedia50Alunos {
    public static void main(String[] args) {
        final double numeroAvaliacoes = 4;
        double nota1, nota2, nota3, nota4;
        double media, media50Alunos=0;
        int i;
        Scanner teclado = new Scanner(System.in);

        for (i = 1; i <= 5; i++){
            System.out.println("Informar nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.println("Informar nota 2: ");
            nota2 = teclado.nextDouble();

            System.out.println("Informar nota 3: ");
            nota3 = teclado.nextDouble();

            System.out.println("Informar nota 4: ");
            nota4 = teclado.nextDouble();

             media = (nota1+nota2+nota3+nota4)/numeroAvaliacoes;
             media50Alunos += media;
        }




        System.out.println("Media dos 5 alunos: "+ media50Alunos/i);
    }
}
