package Lambdas;


public class CalculoTesteLambda {

    public static void main(String[] args) {
        
        //funçao lambda,usado no main, chama o objeto , onde primeiro passo os valores atravez dos parametros
        //coloco a setinha , e os valors de retorno sao os passados pelos parenteses
        
        Calculos calculos = (a, b) -> {  return a+b;  };  //COM chaves e return usado para varias linhas de codigo no corpo da funcao 
        System.out.println(calculos.executar(5, 6));
        
       calculos = (a, b) -> a*b;// SEM chaves e return usado para unica linhas de codigo no corpo da funcao 
       System.out.println(calculos.executar(5, 6));
    }
}
