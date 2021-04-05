package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    
    //uma compra tem vários itens, então é preciso criar uma lista de itens, que contem produtos
    ArrayList<Itens> itens = new ArrayList<>();
    
    
    
     //crio método que chama a lista de itens
    //esse método adiciona nome, preco e quantidade 
    //que é um novo produto que é adicionado a lista de itens, que compoe uma compra
      void adicionarItem(Produto produto,int quantidade){
        this.itens.add(new Itens(produto,quantidade));
    }
      
      
    //crio método que chama a lista de itens
    //esse método adiciona nome, preco e quantidade 
    //que é um novo produto que é adicionado a lista de itens, que compoe uma compra
    void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Itens(new Produto(nome,preco), quantidade));
    }
    

    
    double getTotal(){
        double total = 0;
        
            for(Itens item: itens){
                total += item.quantidade * item.produto.preco;
            }
        return total;
    }
}
