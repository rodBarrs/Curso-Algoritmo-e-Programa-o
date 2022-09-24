package Unidade4;

import java.util.Scanner;

public class MenorValorv2 {

    public static void main(String[] args) {

        int valor, menor, maior;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor Informar o valor: ");
        valor = teclado.nextInt();
        menor = valor;
        maior = valor;
       do {
            if (valor < menor){
                menor = valor;
            }else if (valor > maior){
                maior = valor;
            }
            System.out.println("Favor Informar a matrícula: ");
            valor = teclado.nextInt();
        } while (valor !=0);
        System.out.println("Menor valor: "+ menor);
        System.out.println("Maior valor: "+ maior);
    }
}
