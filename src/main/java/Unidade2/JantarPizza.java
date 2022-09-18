package Unidade2;

import javax.swing.*;

public class JantarPizza {
    public static void main(String[] args) {
       double valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("informar o valor do jantar "));
        int numeroClientes = Integer.parseInt(JOptionPane.showInputDialog("informar o número de clientes"));

        double valorJantarClientes = valor_jantar/numeroClientes;


        JOptionPane.showMessageDialog(null,"O valor total a ser pago por cada cliente "+ valorJantarClientes +"R$");
    }
}
