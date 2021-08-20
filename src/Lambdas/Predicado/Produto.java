package Lambdas.Predicado;

public class Produto {

    final  public String nome;
    final  public Double preco;
    final  Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    
    @Override
    public String toString(){
        return nome + " Preco:"+preco;
    }
    
    
    
}
