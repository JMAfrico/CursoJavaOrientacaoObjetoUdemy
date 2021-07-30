package oo.Gererics;


public class ParesTeste {
    public static void main(String[] args) {
        
        Pares<Integer,String> resultadoConcurso = new Pares<>();
        
        resultadoConcurso.adicionar(1,"Joao");
        resultadoConcurso.adicionar(2, "Elen");
        
        System.out.println(resultadoConcurso.getValor(1));
    }
}
