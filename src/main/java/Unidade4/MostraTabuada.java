package Unidade4;

import javax.swing.*;
import java.util.Scanner;

public class MostraTabuada {

    public static void main(String[] args) {

        int i, numero, total = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informar o número ");
        numero = teclado.nextInt();

        for(i=1;i<=10;i++){
            total = numero * i;
            //System.out.println("Número: " + numero+"X"+i+"="+total);
            JOptionPane.showMessageDialog(null,"Número: " + numero+"X"+i+"="+total);
        }

    }

}
