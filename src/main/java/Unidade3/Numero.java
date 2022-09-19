package Unidade3;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar número: ");
        int numero = teclado.nextInt();

        if (numero%2 == 0){
            System.out.println("Número par ");
        }

    }
}
