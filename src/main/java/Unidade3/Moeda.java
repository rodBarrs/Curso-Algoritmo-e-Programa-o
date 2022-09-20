package Unidade3;

import javax.swing.*;

public class Moeda {
    public static void main(String[] args) {
        double valor, valorConvertido;
        int tipoMoeda;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido"));
        tipoMoeda = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de moeda [1-Libra] [2-Dolar][3-Euro]"));
        switch (tipoMoeda){
            case 1: {
                valorConvertido = valor / 5;
                JOptionPane.showMessageDialog(null, "O valor convertido em libra é de "+ valorConvertido);
                break;
            }
            case 2: {
                valorConvertido = valor / 4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Dolar é de "+ valorConvertido);
                break;
            }
            case 3: {
                valorConvertido = valor / 4.4;
                JOptionPane.showMessageDialog(null, "O valor convertido em Euro é de "+ valorConvertido);
                break;
            }
        }

    }
}
