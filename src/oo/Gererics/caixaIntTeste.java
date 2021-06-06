package oo.Gererics;

public class caixaIntTeste {

    public static void main(String[] args) {

    Presente<String> nome = new Presente();
    Valor valor = new Valor();
    
    nome.setNomePessoa("Joao");
    valor.setCoisa(500);
    System.out.println(nome.getNomePessoa()+" Presenteou Elen com R$"+valor.getCoisa()+",00");
    
    }
}
