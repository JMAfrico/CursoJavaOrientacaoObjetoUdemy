/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author genari
 */
public class ConversaoStringToNumero {
    
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Valor 1: ");
        String valor2 = JOptionPane.showInputDialog("Valor 2: ");
        System.out.println(valor1+valor2);//concatena
        System.out.println(Double.parseDouble(valor1+valor2) );//converte e soma
        JOptionPane.showConfirmDialog(null,Double.parseDouble(valor1+valor2));
        
    }
}
