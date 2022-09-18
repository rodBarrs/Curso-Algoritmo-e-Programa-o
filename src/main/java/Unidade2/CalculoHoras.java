package Unidade2;

import javax.swing.*;

public class CalculoHoras {
    public static void main(String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("informar o número de dias de viagem "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("informar o número de horas de viagem "));
        int totalHoras = (dias*24) + horas;
        JOptionPane.showMessageDialog(null,"O valor total de horas foi de "+ totalHoras);
    }
}
