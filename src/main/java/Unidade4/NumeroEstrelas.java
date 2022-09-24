package Unidade4;

import java.util.Scanner;

public class NumeroEstrelas {
    public static void main(String[] args) {
        int i, numeroDeLinhas;
        String estrelas = "*";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Número de Linhas: ");
        numeroDeLinhas = teclado.nextInt();

        for(i = 1; i<= numeroDeLinhas; i++){
            System.out.println(estrelas);
            estrelas += "*";
        }

    }
}
