package Unidade5;

import java.util.Scanner;

public class CalculaVetor {
    public static void main(String[] args) {
        int i;
        double A[] = new double[10];
        double B[] = new double[10];

        for(i=0;i<10;i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe o valor de A["+i+"]");
            A[i] = teclado.nextDouble();

            if(i%2==0){
                B[i] = 2 * A[i];
            }else {
                B[i] = A[i]/2;
            }
        }

        for (double valor: A){
            System.out.print("A="+valor);

        }
        System.out.println("*****************");
        for (double valor: B){
            System.out.print("B="+valor);
        }

    }
}
