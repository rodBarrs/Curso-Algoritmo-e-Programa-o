package Unidade4;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar o número A: ");
        int a = teclado.nextInt();

        System.out.println("Informar o número B: ");
        int b = teclado.nextInt();

        for (int i=a+1;i < b; i++){
            if (i%2 ==0){
                System.out.println("O número:"+i+" é par!");
            }
        }

    }
}
