package Unidade3;

import java.util.Scanner;

public class RaizExata {
    public static void main(String[] args) {
        int numero;
        double raizExata, maiorValor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar o numero: ");
        numero = teclado.nextInt();
        raizExata = Math.sqrt(numero);
        maiorValor = Math.round(raizExata);

        if (raizExata == maiorValor){
            System.out.println("Existe Raiz Exata para o numero " + numero);
        }
    }


}
