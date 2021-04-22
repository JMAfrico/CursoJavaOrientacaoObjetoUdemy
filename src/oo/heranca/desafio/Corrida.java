package oo.heranca.desafio;

public class Corrida {

    public static void main(String[] args) {
        
        Carro lancer = new Lancer();
        Carro fiesta = new Fiesta();
        
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        
        fiesta.acelerar();
        fiesta.acelerar();
        fiesta.acelerar();
        fiesta.acelerar();
        
        System.out.println(lancer);
        System.out.println(fiesta);
        
       
        if(lancer.getAceleracao() > fiesta.getAceleracao()){
            System.out.println("Lancer está mais rápido");
        }
        else{
            System.out.println("Fiesta está mais rápido");
        }
        
    }
}
