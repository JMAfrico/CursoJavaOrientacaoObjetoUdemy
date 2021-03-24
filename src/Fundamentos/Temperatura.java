package Fundamentos;

import javax.swing.JOptionPane;

public class Temperatura {
    public static void main(String[] args) {
        //(F - 32) * 5/9 = C
        double fator = 5.0/9.0,base = 32,fahrenheit=12,celsius;
        
        //formula
        celsius = (fahrenheit - base) * fator;
        
        JOptionPane.showMessageDialog(null, "Temperatura " +fahrenheit+ "ºF = "+celsius+"ºC");
    }
}
