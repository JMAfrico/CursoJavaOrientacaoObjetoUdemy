package Lambdas;

import java.util.function.BinaryOperator;

//Ao invés de utilizar uma classe Que criamos para fazer uma função, vamos utilizar uma classe que o próprio
//java já tem, que está no pacote Java.util.function
public class CalculoTeste3 {
    
    public static void main(String[] args) {
        
        //Documentação Java.util.function
        BinaryOperator<Double> calculos = (a, b) -> a * b ;  // função que já vem no pacote java.util.function
       System.out.println(calculos.apply(5.0, 6.0));

    }

}
