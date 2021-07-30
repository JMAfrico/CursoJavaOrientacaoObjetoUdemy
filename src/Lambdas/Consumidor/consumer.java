package Lambdas.Consumidor;

import Lambdas.Predicado.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {
        
        //FUNÇÃO DE IMPRIMIR
         Consumer<Produto> imprimir = 
                   p -> System.out.println(p.nome);
         
         //INSTÂNCIA DE OBJETO
         Produto p1 = new Produto("Caneta", 1.50, 0.03);
         Produto p2 = new Produto("borracha", 2.50, 0.01);
         Produto p3 = new Produto("Laípis", 3.50, 0.03);
         Produto p4 = new Produto("Caderno", 5.50, 0.03);
         Produto p5 = new Produto("Canetinha", 12.50, 0.03);
         
         //EXECUTAR FUNCAO CONSUMER UM UNICO REGISTRO
         imprimir.accept(p1);
         
         //LISTA DE PRODUTOS
         List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
         
         //EXECUTAR FUNCAO CONSUMER PARA MOSTRAR UMA LISTA
         produtos.forEach(imprimir);
         
         produtos.forEach(p -> System.out.println(p.preco));
         
         produtos.forEach(System.out::println);
         
         
         
         
    }
}
