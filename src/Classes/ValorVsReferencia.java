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
public class ValorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a; // atribuição por valor, cópia do VALOR de A
        
        a++;
        b--;
        
        System.out.println("a="+a+"/b="+b);
        
        Data d1 = new Data(1,6,2022);
        Data d2 = d1;// atribuição por refencia, uma cópia de d1 que manipula o mesmo espaço de memória
        
        d1.dia = "7";
        d2.mes="5";
        System.out.println(d1.Dataformatada4());//os dois resultados são iguais porque d2 é uma cópia
        System.out.println(d2.Dataformatada4());
        
        DataPadrao(d2);
        
        System.out.println(d1.Dataformatada4());//os dois resultados são iguais porque d2 é uma cópia
        System.out.println(d2.Dataformatada4());
    }
    
    static void DataPadrao(Data d){//alterando o local de memória para o valor padrão
        d.dias = 5;
        d.mess = 7;
        d.anos = 1999;
        
    }
}
