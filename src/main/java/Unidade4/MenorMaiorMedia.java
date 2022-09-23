package Unidade4;

import java.util.Scanner;

public class MenorMaiorMedia {
    public static void main(String[] args) {
        double valor, menor, maior, media=0;
        int  cont = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor Informar o valor: ");
        valor = teclado.nextDouble();
        menor = valor;
        maior = valor;
        while (valor !=0){
            cont++;
            if (valor < menor){
                menor = valor;
            }else if (valor > maior){
                maior = valor;
            }
            media += valor;
            System.out.println("Favor Informar o valor: ");
            valor = teclado.nextDouble();
        }
        media /= cont;
        System.out.println("Menor valor: "+ menor);
        System.out.println("Maior valor: "+ maior);
        System.out.println("Média valor: "+ media);
    }
}
