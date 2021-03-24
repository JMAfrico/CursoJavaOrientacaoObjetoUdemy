package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero 1:");
        double n1 = entrada.nextDouble();
        
        System.out.println("Numero 1:");
        double n2= entrada.nextDouble();
        
        System.out.println("Operacção:");
        String op = entrada.next();
        
        //armazenar na variavel res, se "+" for igual a variavel op
        // significa (?) que vai pegar o valor de n1 + n2, caso contrário
        // vai retornar 0;
        double res = "+".equals(op) ? n1 + n2 : 0;
                     res = "-".equals(op) ? n1 - n2 : res;
                     res = "*".equals(op) ? n1 * n2 : res;
                     res = "/".equals(op) ? n1 / n2 : res;
        
        System.out.printf("%.2f %s %.2f = %.2f ", n1,op,n2,res);
        entrada.close();

        
            
    }
    
}
