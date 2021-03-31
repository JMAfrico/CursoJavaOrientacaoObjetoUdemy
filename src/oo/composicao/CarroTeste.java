
package oo.composicao;

public class CarroTeste {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        
        System.out.println(carro.estaLigado());
        carro.ligar();
        System.out.println(carro.estaLigado());
        
        //chamada do objeto do objeto
        System.out.println(carro.motor.giros());      
        carro.acelerar();
        
        //como acelerou o carro,que multiplica pelo giros
        //aumentou a aceleracao    
        System.out.println(carro.motor.giros());     
        carro.frear();
        
        System.out.println(carro.motor.giros());  
        
    }
}
