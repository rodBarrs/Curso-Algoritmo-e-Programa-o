package Unidade2;

import javax.swing.*;
import java.util.Scanner;

public class CalculaDobro {
    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número");
        double numero = teclado.nextDouble();
        double dobro = numero * 2;
        System.out.println("O dobro de "+ numero+" é "+ dobro);

         */
        var numero = JOptionPane.showInputDialog("Digite o número: ");
        var dobro = Double.parseDouble(numero) * 2;
        JOptionPane.showMessageDialog(null,"O dobro de "+ numero+" é "+ dobro);
    }
}
