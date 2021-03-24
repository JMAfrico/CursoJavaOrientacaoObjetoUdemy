package Controle;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        
        // PROGRAMA QUE CALCULA A TABUADA ATÉ 10
        System.out.println("Qual tabuada vc quer saber? ");
        n = entrada.nextInt();
        
        for (int c = 1; c <= 10; c++)
        {            
            System.out.println(n+"*"+c+"= "  +n*c);
        }
//        
//        //SEGUNDO MODO FOR
//        int x = 2;
//         for (; x <= 10;)
//        {            
//            System.out.println("x = "+ x*2);
//            x++;
//        }
//         
////         //LAÇO INFINITO
////         for(;;){
////             System.out.println("FIM");
////         }
        
    }
    
}
