package Unidade2;

import javax.swing.*;

public class Numero {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("informar o número "));
        int antecedor = numero - 1;
        int posterior = numero + 1;

        JOptionPane.showMessageDialog(null,"O valor do numero anterior "+ antecedor+
                " e posterior "+posterior);
    }
}
