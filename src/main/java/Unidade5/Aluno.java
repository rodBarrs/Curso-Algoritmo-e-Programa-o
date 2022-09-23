package Unidade5;

import javax.swing.*;

public class Aluno {
    public static void main(String[] args) {
        int i;
        String nome;
        String listaAlunos [] = new String[5];

        for (i = 0; i < listaAlunos.length; i++){
            nome = JOptionPane.showInputDialog("Digite o nome: ");
            listaAlunos[i] = nome;
        }

        for (i = 0; i < listaAlunos.length; i++){
            JOptionPane.showMessageDialog(null,listaAlunos[i]);

        }

    }
}
