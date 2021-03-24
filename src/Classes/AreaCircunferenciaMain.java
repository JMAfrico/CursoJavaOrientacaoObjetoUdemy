/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author genari
 */
public class AreaCircunferenciaMain {
    
    public static void main(String[] args) {
        
        AreaCircunferencia a1 = new AreaCircunferencia(13.5);
        double res = a1.calcArea();
        System.out.println("Calculo da area = "+res);
        System.out.println("");
        System.out.printf("Calculo da area = %3.2f ",res);
        System.out.println("");
        
       // AreaCircunferencia.pi;(static valor padrão da classe AreaCircunferencia)
        AreaCircunferencia.pi=3;//(static posso alterar o valor padrão)
        
        System.out.println("PI="+AreaCircunferencia.pi);
        
        System.out.println("");
        AreaCircunferencia a2 = new AreaCircunferencia(5);
        double res2 = a2.calcArea();
        System.out.println("Calculo da area = "+res2);
        System.out.println("");
        System.out.printf("Calculo da area = %3.2f ",res2);

        System.out.println("");
        //Calculo de area, passando por parâmetro diretamente na classe sem precisar criar um objeto
        System.out.println(AreaCircunferencia.calcArea(5));
    }
}
