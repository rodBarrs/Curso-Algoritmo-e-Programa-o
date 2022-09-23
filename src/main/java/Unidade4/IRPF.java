package Unidade4;

import javax.swing.*;

public class IRPF {

    public static void main(String[] args) {

        double irpf, rendaMensal, salarioLiquido;
        int numeroDependentes, numeroContribuintes = 1;
        String cpf, nome;

        while(numeroContribuintes <= 3){
            nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            cpf = JOptionPane.showInputDialog("Digite o seu Cpf:");
            numeroDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes:"));
            rendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal: "));

           salarioLiquido = rendaMensal - (numeroDependentes*189.59) - 0.11*rendaMensal;

           if (salarioLiquido <= 1903.98){
               irpf = 0;
               JOptionPane.showMessageDialog(null,"O contribuinte "+ nome+ "é isento!");
           } else if ((salarioLiquido >= 1903.99) && (salarioLiquido <= 2865.65)){
               irpf = 0.075*salarioLiquido - 142.80;
               JOptionPane.showMessageDialog(null,"O IRPF do contribuinte "+ nome+" é de R$"+irpf);
           }else if ((salarioLiquido >= 2865.66) && (salarioLiquido <= 3751.05)){
               irpf = 0.015*salarioLiquido - 354.80;
               JOptionPane.showMessageDialog(null,"O IRPF do contribuinte "+ nome+" é de R$"+irpf);
           }else if ((salarioLiquido >= 3751.06) && (salarioLiquido <= 4664.68)){
               irpf = 0.225*salarioLiquido - 636.13;
               JOptionPane.showMessageDialog(null,"O IRPF do contribuinte "+ nome+" é de R$"+irpf);
           }else{
               irpf = 0.275*salarioLiquido - 869.13;
               JOptionPane.showMessageDialog(null,"O IRPF do contribuinte "+ nome+" é de R$"+irpf);
           }
        }


    }

}
