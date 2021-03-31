package oo.composicao;

import java.util.ArrayList;

public class Compra {

    //classe compra, onde defino que a compra 
    //será composta de produtos(arrayList) e um cliente
    
    ArrayList<Produto> produtos = new ArrayList();
    
    
    double total(){
        double subtotal = 0;
        for(Produto p: produtos){
            subtotal = subtotal + (p.preco * p.qt);
            //ou 
            //subtotal += p.preco * p.qt;
        }
        return subtotal;
    }
}
