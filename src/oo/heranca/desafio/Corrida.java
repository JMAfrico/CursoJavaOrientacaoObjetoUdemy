package oo.heranca.desafio;

public class Corrida {

    public static void main(String[] args) {
        
        Carro lancer = new Lancer(200);
        Carro fiesta = new Fiesta(120);//se eu chamar assim, vou alterar a velocidade de cada fiesta
        Carro fiesta2 = new Fiesta();//se eu chamar assim, vou deixar a velocidade padrão que está definida na classe fiesta
        
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();//chegou aqui, não deixa ultrapassar a velocidade maxima passada por parâmetro
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
