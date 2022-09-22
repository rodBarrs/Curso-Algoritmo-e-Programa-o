package Unidade4;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        double fatorial = 1;
        int numero, i;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar o número: ");
        numero = teclado.nextInt();
        i = numero;
        while (i >= 1){
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial do número "+numero+": "+ fatorial);

    }

}
