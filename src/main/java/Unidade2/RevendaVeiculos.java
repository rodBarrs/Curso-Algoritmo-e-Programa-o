package Unidade2;

import javax.swing.*;

public class RevendaVeiculos {
    public static void main(String[] args) {
        var modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");

        double precoCarro = Double.parseDouble(JOptionPane.showInputDialog("Preco do Carro "));

        double entrada = 0.5 * precoCarro;
        double restante = entrada / 12;

        JOptionPane.showMessageDialog(null,"Entrada: " + entrada+ "Restante" + restante);
    }
}
