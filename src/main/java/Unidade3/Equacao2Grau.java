package Unidade3;

import java.util.Scanner;

public class Equacao2Grau {
    public static void main(String[] args) {
        int a, b, c;
        double delta, x1,x2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar o valor de A: ");
        a = teclado.nextInt();

        System.out.println("Informar o valor de B: ");
        b = teclado.nextInt();

        System.out.println("Informar o valor de C: ");
        c = teclado.nextInt();

        delta = b*b - 4 * a * c;

        if (delta >= 0){
            x1 = -b - (Math.sqrt(delta))/ 2*a;
            x2 = -b + (Math.sqrt(delta))/ 2*a;
            System.out.println("O valor de x1= "+ x1 );
            System.out.println("O valor de xx= "+ x2 );
        }else {
            System.out.println("Não existem raizes reais!");
        }

    }
}
