package Controle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String n = "";
        int x;
        
        // PROGRAMA QUE CALCULA A TABUADA ATÉ 10

        while (!n.equalsIgnoreCase("Sair")) {            
        System.out.println("Qual tabuada vc quer saber? ");
        n = entrada.nextLine();
        x = Integer.parseInt(n);
        
        for(int c = 1;c<=10;c++){
            System.out.println(x+"*"+c+"= "  +x*c);
        }
        }
    }
    
}
