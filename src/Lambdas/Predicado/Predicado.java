package Lambdas.Predicado;

import java.util.function.Predicate;

//Predicato recebe um objeto, e retorna true ou false
public class Predicado {
    
    public static void main(String[] args) {
        //função que vai verificar se o produto é caro, se o prod.preco for maior que 1000 o resultado é true
        Predicate<Produto> isCaro = prod -> prod.preco >= 1.000;

        Produto p = new Produto("TV",0.900,0.3);//instancia de novo produto
        System.out.println(isCaro.test(p));
        
        
    }
}
