package Unidade2;

import javax.swing.*;
import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        String nome = teclado.next();
//        System.out.println("Seja bem vindo "+ nome);

        var nome = JOptionPane.showInputDialog("Digite o nome: ");
        JOptionPane.showMessageDialog(null,"seja bem vindo "+ nome);
    }
}
