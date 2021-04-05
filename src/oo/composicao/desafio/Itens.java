package oo.composicao.desafio;

import java.util.ArrayList;

public class Itens {
    
    //crio item para armazenar vários produtos
    int quantidade;
    Produto produto;

    //crio método construtor onde passo o "produto" da classe Produto que será adicionado
    //e a quantidade que será adicionado
    public Itens(Produto produto,int quantidade ) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    
    
}
