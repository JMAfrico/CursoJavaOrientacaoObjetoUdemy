package Controle;

import java.util.Scanner;


public class Switch {

        public static void main(String [] args){
            
            
            //--EXEMPLO 1- sem break-//
            String faixa = "preta";
            
            switch(faixa.toLowerCase()){
                case "branca": System.out.println("Fraquinho");
                case "preta" : System.out.println("Bomzão");
                case "Roxa" : System.out.println("Mais ou menos");
                default:System.out.println("Não sabe nada");
            }
            System.out.println("FIm");
            
             //--EXEMPLO 2-com break-//
            Scanner entrada = new Scanner(System.in);
            
            String conceito ="";
            System.out.println("Informe a nota");
            int nota = entrada.nextInt();
            
            switch(nota){
                case 10: case 9: case 8:
                    conceito = "Parabens";
                    break;
                case 7: case 6: 
                    conceito="Quase";
                    break;
                default: 
                    conceito="Reprovado";
                    break;
            }

            System.out.println("Conceito= "+conceito);
            
             //--EXEMPLO 3-Continue-//
             //quando o resultado é true, ele interrompe o código e volta, o if pula o código
             for (int i = 0; i < 10; i++) {
                if(i % 2 == 1){
                    continue;
                }               
                 System.out.println(i);
            }
             
             //--  EXEMPLO 4- BREAK ROTULADO
             externo: for (int i = 0; i <= 3; i++) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 1) {
                                        break externo;
                                     }
                                System.out.printf("[%d %d]",i,j);
                     }
                 System.out.println();
            }
             
        }
}
