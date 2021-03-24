
package Fundamentos;

import java.util.Scanner;


public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("SALARIO 1:");
        String valor1 = entrada.next().replace(",", ".");
        
        System.out.println("SALARIO 2:");
        String valor2 = entrada.next().replace(",", ".");
        
        System.out.println("SALARIO 3:");
        String valor3 = entrada.next().replace(",", ".");
        
        double s1 = Double.parseDouble(valor1);
        double s2 = Double.parseDouble(valor2);
        double s3 = Double.parseDouble(valor3);
        
        double media = (s1+s2+s3)/3;
        
        System.out.println("Total ="+media);
        
        entrada.close();
        
        
    }
}
