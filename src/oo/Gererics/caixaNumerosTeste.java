package oo.Gererics;


public class caixaNumerosTeste {

    public static void main(String[] args) {
        
    Presente<String> nome = new Presente();
    caixaNumeros<Integer> valor = new caixaNumeros();
    caixaNumeros<Double> valor2 = new caixaNumeros();
    
    nome.setNomePessoa("Joao");
    valor.setCoisa(500);
    valor2.setCoisa(500.00);
    System.out.println(nome.getNomePessoa()+" Presenteou Elen com R$"+valor.getCoisa());
    }
}
