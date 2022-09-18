package Unidade2;

import javax.swing.*;

public class EscreveVariaveis {
    public static void main(String[] args) {
//        String fruta = "Banana";
        double valor = 3.5;
        String fruta = JOptionPane.showInputDialog("Digite a fruta");
        System.out.println("O valor da "+ fruta + "é de " + valor);

        JOptionPane.showMessageDialog(null, "O valor da "+ fruta + " é de " + valor);
    }
}
