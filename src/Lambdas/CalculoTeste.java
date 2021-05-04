package Lambdas;


public class CalculoTeste {

    public static void main(String[] args) {
//        Somar somar = new Somar();
//        Multiplicar multiplicar = new Multiplicar();
//        System.out.println(somar.executar(5, 6));
//        System.out.println(multiplicar.executar(5, 6));
        
        Calculos calculos = new Somar();
        System.out.println(calculos.executar(4, 7));
        
        //posso usar o mesmo nome de objeto por causa do polimorfismo, varios metodos iguais em
        //classes diferentes
        calculos = new Multiplicar();
        System.out.println(calculos.executar(4, 7));
    }
}
