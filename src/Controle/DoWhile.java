package Controle;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        

        do {            
            System.out.println("Qual tabuada vc quer saber? ");
            texto = entrada.nextLine();
            
        } while (!texto.equalsIgnoreCase("Sair"));
        
    }
}
