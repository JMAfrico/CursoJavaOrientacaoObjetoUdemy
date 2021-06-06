package oo.Gererics;

public class caixaGenericsTeste {
    
    public static void main(String[] args) {
        //Não importa o tipo, é só eu especificar entre os sinais que vai funcionar
        caixaGenerics<String> caixaA = new caixaGenerics();
        caixaA.setCoisa("Joao");
        System.out.println(caixaA.getCoisa());
        
        caixaGenerics<Integer> caixaB = new  caixaGenerics();
        caixaB.setCoisa(50);
        caixaB.getCoisa();
    }
}
