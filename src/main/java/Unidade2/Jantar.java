package Unidade2;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args) {
        final double taxa_garcom = 0.1;
        double valor_jantar, valor_jantar_total;

        valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("informar o valor do jantar "));
        valor_jantar_total = valor_jantar + (taxa_garcom*valor_jantar);
        JOptionPane.showMessageDialog(null,"O valor do jantar total é de "+ valor_jantar_total);

    }
}
