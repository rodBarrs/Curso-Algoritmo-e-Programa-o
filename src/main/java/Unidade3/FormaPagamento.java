package Unidade3;

import javax.swing.*;

public class FormaPagamento {
    public static void main(String[] args) {
        double valorProduto, valorFinalProduto;
        int codigo;

        valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do produto"));
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de pagamento[1- 10% de desconto à vista][2- 5% de desconto no cartão][3- 2x sem juros][4- 3x com juros de 10%]"));
        switch (codigo) {
            case 1: {
                valorFinalProduto = valorProduto * 0.9;
                JOptionPane.showMessageDialog(null, "O valor final com desconto de 10% será de " + valorFinalProduto);
                break;
            }
            case 2: {
                valorFinalProduto = valorProduto * 0.95;
                JOptionPane.showMessageDialog(null, "O valor final com desconto de 5% será de " + valorFinalProduto);
                break;
            }
            case 3: {
                valorFinalProduto = valorProduto;
                JOptionPane.showMessageDialog(null, "O valor final em 2X sem juros será de " + valorFinalProduto);
                break;
            }
            case 4: {
                valorFinalProduto = valorProduto * 1.1;
                JOptionPane.showMessageDialog(null, "O valor final em 3X com juros de 10% será de " + valorFinalProduto);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção digitada incorreta");
                FormaPagamento.main(null);
        }
    }
}
