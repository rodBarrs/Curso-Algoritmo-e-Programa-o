package Unidade3;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o lado A do Triangulo: ");
        var a = teclado.nextInt();

        System.out.println("Digite o lado B do Triangulo: ");
        var b = teclado.nextInt();

        System.out.println("Digite o lado C do Triangulo: ");
        var c = teclado.nextInt();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            if ((a==b) && (b == c)){
                System.out.println("Triangulo Equilátero!");
            }else if ((a == b) || (b==c)) {
                System.out.println("Triangulo Isosceles!");
            } else {
                System.out.println("Triangulo Escaleno!");
            }
        }else {
            System.out.println("Os lados informados não formam um triangulo! ");
        }
    }
}
