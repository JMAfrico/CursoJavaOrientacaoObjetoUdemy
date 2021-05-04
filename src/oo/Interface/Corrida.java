package oo.Interface;


public class Corrida {

        public static void main(String[] args) {
          
        Lancer lancer = new Lancer(200);
        Fiesta fiesta = new Fiesta(120);//se eu chamar assim, vou alterar a velocidade de cada fiesta
        Fiesta fiesta2 = new Fiesta();//se eu chamar assim, vou deixar a velocidade padrão que está definida na classe fiesta
             
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
        fiesta.ligarArCondicionado();
        fiesta.acelerar();
        fiesta.ligarTurbo();
        fiesta.acelerar();
        fiesta.acelerar();
        fiesta.desligarArCondicionado();
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
