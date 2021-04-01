package oo.composicao;

import java.util.ArrayList;

public class Compra {

    //classe compra, onde defino que a compra 
    //será composta de produtos(arrayList) e um cliente   
    ArrayList<Produto> produtos = new ArrayList();
    
    //Faz a conta do total dos itens selecionados pelo cliente
    double getTotal(){
        double total = 0;
        for(Produto p: produtos){
            total += p.preco * p.qt;      
        }
        System.out.println("Total da compra: "+total);
        return total;
    }
    
    //Mostra a lista dos itens do cliente
    void getLista()
    {
            for(Produto p : produtos)
            {
                System.out.println("Produto: "+p.nome + "   Preço: "+p.preco+"   Quantidade: "+p.qt);
            }
    }
}
