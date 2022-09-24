package Unidade5;

import javax.swing.*;

public class Matematica {

    public static void tabuada (int numero){
        int total = 0;
        for(int i=1;i<=10;i++){
            total = numero * i;
            JOptionPane.showMessageDialog(null,"Número: " + numero+"X"+i+"="+total);
        }
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        tabuada(numero);
    }
}
