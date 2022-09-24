package Unidade5;

import javax.swing.*;

public class Fibonacci {

    public static void fibo(int numero){
        int s1 = 1;
        int s2 = 1;
        int s = 0;
        JOptionPane.showMessageDialog(null,s1+","+s2+",");
        for (int i = 3; i <= numero; i++) {
            s = s1 + s2;
            s1 = s2;
            s2 = s;
            JOptionPane.showMessageDialog(null,s+",");
        }

    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
        fibo(numero);
        
    }
}
