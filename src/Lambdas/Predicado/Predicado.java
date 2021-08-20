package Lambdas.Predicado;

import java.util.function.Predicate;

//Predicato recebe um objeto, e retorna true ou false
public class Predicado {
    
    public static void main(String[] args) {
        //funcao que vai verificar se o produto e caro, se o prod.preco for maior que 1000 o resultado e true
        Predicate<Produto> isCaro = prod -> prod.preco >= 1.000;

        Produto p = new Produto("TV",1.900,0.3);//instancia de novo produto
        System.out.println(isCaro.test(p));
        
        
    }
}
