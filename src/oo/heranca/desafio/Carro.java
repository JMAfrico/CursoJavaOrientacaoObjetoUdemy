package oo.heranca.desafio;

public class Carro {

    //private só membros da classe acessam
    protected double aceleraçao = 0;
    protected final double VELOCIDADE_MAXIMA;

    
    protected Carro(double velocidade_maxima) {
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }
    
    //protected, só quem é herança e/ou fazem parte do mesmo pacote pode acessar
    protected boolean acelerar(){
            aceleraçao = aceleraçao + 5;   
        return true;
    }
    
    protected boolean frear(){
        aceleraçao = aceleraçao - 5;
        return true;
    }
    
    protected double getAceleracao(){
        return aceleraçao;
    }
    
    @Override//Quando eu chamar o objeto, por padrão vai aparecer essa mensagem
    public String toString(){
        return "Aceleração atual "+aceleraçao+"Km/h";
    }
}