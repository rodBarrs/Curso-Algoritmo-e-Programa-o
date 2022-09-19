package Unidade2;

import javax.swing.*;

public class LanHouse {
    public static void main(String[] args) {
        final int VALOR_POR_15MINUTOS = 2;

        double horas, minutos, total_minutos;
        double totalAPagar;

         horas = Double.parseDouble(JOptionPane.showInputDialog("informar o numero de horas "));
         minutos = Double.parseDouble(JOptionPane.showInputDialog("informar o numero de minutos "));

         total_minutos = horas * 60 + minutos;

         totalAPagar = Math.ceil((total_minutos / 15))*VALOR_POR_15MINUTOS;

        JOptionPane.showMessageDialog(null,"O valor a pagar é de "+ totalAPagar);
    }
}
