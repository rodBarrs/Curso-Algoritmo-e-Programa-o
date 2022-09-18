package Unidade2;

import javax.swing.*;

public class OpcoesPagamento {
    public static void main(String[] args) {
        double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("informar o valor do produto "));
        double produtoAVista = valor_produto * 0.9;
        double produtoParcelado = valor_produto / 3;

        System.out.println("O produto pago a vista tem 10% de desconto e sairá por "+ produtoAVista);
        System.out.println("O produto pago a prazo em 3 x sairá por "+ produtoParcelado);
    }
}
