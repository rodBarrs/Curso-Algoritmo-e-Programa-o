package Unidade3;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura, pesoIdealHomem, pesoIdealMulher;
        String sexo;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        sexo = JOptionPane.showInputDialog("Digite o sexo: ");

        if (sexo.equals("M")){
            pesoIdealHomem = (altura*72.7) - 58;
            System.out.println("O peso ideal do homem é de "+ pesoIdealHomem);
        }else{
            pesoIdealMulher = (altura*62.1) - 44.7;
            System.out.println("O peso ideal da mulher é de "+ pesoIdealMulher);
        }
    }
}
