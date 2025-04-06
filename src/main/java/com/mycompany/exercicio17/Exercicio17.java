/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio17 {

    public static void main(String[] args) {
        String profissao;
        profissao = JOptionPane.showInputDialog("Tibúrcio é: "
                + " \n e - engenheiro \n p - programador \n m - medico \n a - advogado \n d - designer");
        switch (profissao) {
            case "e":
                JOptionPane.showMessageDialog(null, "Tibúrcio é engenheiro");
                break;
            case "p":
                JOptionPane.showMessageDialog(null, "Tibúrcio é programador ");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, "Tibúrcio é médico ");
                break;
            case "a":
                JOptionPane.showMessageDialog(null, "Tibúrcio é advogado");
                break;
                case "d":
                JOptionPane.showMessageDialog(null, "Tibúrcio é designer");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tibúrcio é desempregado");
                break;
        }
    }

}