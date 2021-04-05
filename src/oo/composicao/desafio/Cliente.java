package oo.composicao.desafio;

import java.util.ArrayList;


public class Cliente {
    //Crio cliente, esse cliente tem uma lista de compras que ele efetuou
    String nome;   
    ArrayList<Compra> compra = new ArrayList<>();

    //Método construtor com parametro
    public Cliente(String nome) {
        this.nome = nome;
    }  
    
        double getTotalCompras(){
            double total_compras = 0;
                
            for(Compra c: compra){
                total_compras += c.getTotal();
                
            }
            return total_compras;
            
        }
    
}
