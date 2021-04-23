package oo.heranca.desafio;


public class Fiesta extends Carro{

    Fiesta(){
        this(150);//chamo o construtor de baixo, como referencia do this "this(120)" é o mesmo que "fiesta(int velocidadeMaxima)"do construtor abaixo
    }
    
    Fiesta(int velocidadeMaxima){
        super(150);
    }
    
    @Override
    public boolean acelerar() {
        return super.acelerar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean frear() {
        return super.frear(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
