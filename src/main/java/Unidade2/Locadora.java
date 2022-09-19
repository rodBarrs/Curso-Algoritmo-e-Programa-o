package Unidade2;

import javax.swing.*;

public class Locadora {
    public static void main(String[] args) {

        var tituloFilme = JOptionPane.showInputDialog("Digite o titulo do filme: ");

        int duracaoFilmesHoras = Integer.parseInt(JOptionPane.showInputDialog("Duração de horas "));

        int duracaoFilmesMinutos = Integer.parseInt(JOptionPane.showInputDialog("Duração de minutos"));

        int novaDuracaoFilme = duracaoFilmesHoras*60 + duracaoFilmesMinutos;

        JOptionPane.showMessageDialog(null,"Duração total filme " + novaDuracaoFilme);

    }
}
