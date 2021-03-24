/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentos;

/**
 *
 * @author genari
 */
public class ConversaoTipoPrimitivoNumerico {
    
    public static void main(String[] args) {
        
        double a = 1; //conversão implícita, java transforma 1(int) em 1.0(float)
        System.out.println(a);
        
        float b = (float)1.054; // conversão explícita (CAST), java transforma 1.0 double em 1.0 float na variavel float b
        System.out.println(b);
        
        
       int c = 130;
       byte d = (byte) c;
        System.out.println(c+","+d);
    }
    
}
