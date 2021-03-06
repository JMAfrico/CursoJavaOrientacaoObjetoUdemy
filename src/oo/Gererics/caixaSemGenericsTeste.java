package oo.Gererics;

public class caixaSemGenericsTeste {

    public static void main(String[] args) {
         
        //Ao chamar um objeto 
        //é necessário utilizar um único tipo sem classe genérica
        //e exige conversão forçada de cada objeto
        
        //EXEMPLO 1
        caixaSemGenerics caixaA = new caixaSemGenerics(); 
        caixaA.setCoisa(2.3); // double -> Double(cast) pq um objeto não é tipo primitivo    
        Double coisaA = (Double) caixaA.getCoisa(); // conversão forçada e trabalhosa
        System.out.println(coisaA);
        
        //EXEMPLO 2
         caixaSemGenerics caixaB = new caixaSemGenerics(); 
        caixaB.setCoisa("João"); 
        String coisaB = (String) caixaB.getCoisa(); 
        System.out.println(coisaB);
        
    }

}
