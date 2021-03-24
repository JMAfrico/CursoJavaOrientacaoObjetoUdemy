
package Classes;


public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;//esse valor passa a ser o valor de desconto de todos os produtos,
                                                            //quando for chamado na outra classe, não é necessário alterar

    
    //Método não precisa de parametro, pois ja temos os dados pelas variáveis
    public double precoComDesconto(){        
        preco = preco*(1- desconto);      
        return preco;
    }
    
    
    public double precoComDesconto(double descGerente){
                preco = preco*(1- desconto - (descGerente));      
                return preco;
    }
    
     //Método Construtor Padrão, deve ter o mesmo nome da classe
    public Produto() {
        
    }
    
    //Método Construtor Com um novo parâmetro, deve ter o mesmo nome da classe
    public Produto(String nomeProduto){
        nome = nomeProduto;
    }
    //Método Construtor Com dois parâmetros
    public Produto(String nomeProduto,double PrecoProduto){
        nome = nomeProduto;
        preco = PrecoProduto;
    }
    //Método Construtor Com três parâmetros
    public Produto(String nomeProduto,double PrecoProduto,double descProduto){
        nome = nomeProduto;
        preco = PrecoProduto;
        desconto = descProduto;
    }

    
    
}
