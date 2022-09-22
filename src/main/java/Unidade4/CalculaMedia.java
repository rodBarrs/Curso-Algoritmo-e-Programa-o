package Unidade4;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor Informar o Valor: ");
        var valor = teclado.nextInt();

        var somaValor = 0;
        var cont = 0;

        while (valor !=-1){
            somaValor += valor;
            cont++;

            System.out.println("Favor Informar o Valor: ");
            valor = teclado.nextInt();
        }
        System.out.println("Média: "+ somaValor/cont);

    }
}
