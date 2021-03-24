package Controle;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a média");
        double media = entrada.nextDouble();
        
        if (media > 6.9) {
            
            System.out.println("Aprovado");
         
        }
        else
            System.out.println("Reprovado");
        entrada.close();
    }
}
