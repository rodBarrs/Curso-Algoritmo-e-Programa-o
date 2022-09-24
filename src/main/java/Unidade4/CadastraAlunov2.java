package Unidade4;

import java.util.Scanner;

public class CadastraAlunov2 {
    public static void main(String[] args) {

        String nome, endereco, telefone;
        int matricula, cont = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor Informar a matrícula: ");
        matricula = teclado.nextInt();

       do{
           if (matricula != 0) {
               System.out.println("Favor Informar o nome: ");
               nome = teclado.next();
               System.out.println("Favor Informar o Endereço: ");
               endereco = teclado.next();
               System.out.println("Favor Informar o telefone: ");
               telefone = teclado.next();
               cont++;
               System.out.println("Favor Informar a matrícula do próximo aluno: ");
               matricula = teclado.nextInt();
           }
        }while (matricula != 0);

    }
}
