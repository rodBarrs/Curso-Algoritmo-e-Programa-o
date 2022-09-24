package Unidade4;

import javax.swing.*;

public class NumeroPrimo {

    public static void main(String[] args) {

        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        int numeroDivisores = 0;

        for (int i = 1; i <= numero; i++){
            if (numero%i == 0){
                numeroDivisores++;
            }
        }
        if (numeroDivisores==2){
            JOptionPane.showMessageDialog(null,numero+" é Primo");
        }else{
            JOptionPane.showMessageDialog(null,numero+" Não é Primo");
        }


    }
}
