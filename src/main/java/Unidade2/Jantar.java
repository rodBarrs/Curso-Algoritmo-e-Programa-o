package Unidade2;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args) {

        Integer[] options = {15, 18,22};
        final float taxa_garcom ;
        float valor_jantar, valor_jantar_total;
         taxa_garcom = (Integer)JOptionPane.showInputDialog(null, "Valor taxa Garçom",
                null, JOptionPane.QUESTION_MESSAGE, null, options, null);
        valor_jantar = Float.parseFloat(JOptionPane.showInputDialog("informar o valor do jantar "));
        valor_jantar_total = valor_jantar + (taxa_garcom/100*valor_jantar);
        JOptionPane.showMessageDialog(null,"O valor do jantar total é de "+ valor_jantar_total);

    }
}
