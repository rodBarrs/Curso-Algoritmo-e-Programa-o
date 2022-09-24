package Unidade4;

import javax.swing.*;

public class Contas {
    public static void main(String[] args) {

        var descricaoConta = JOptionPane.showInputDialog("Digite o nome da conta: ");
        var valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta:"));
        int numeroContas = 0;
        double valorTotal = 0;
        while (valor > 0){
            JOptionPane.showMessageDialog(null, "Conta: "+ descricaoConta+"-valor: "+ valor);
            numeroContas++;
            valorTotal += valor;
            descricaoConta = JOptionPane.showInputDialog("Digite o nome da conta: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta:"));

        }
        JOptionPane.showMessageDialog(null, "Número de conta(s): "+ numeroContas+"-valor: "+ valorTotal);


    }
}
