
package Controle;

import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n,c;
        
        // PROGRAMA QUE CALCULA A TABUADA ATÉ 10
        System.out.println("Qual tabuada vc quer saber? ");
        n = entrada.nextInt();
        c = 1;
        
        while (c <= 10){
            System.out.println(n+" * "+c+"="  +n*c);
            c++;
        }
        
    }
}
