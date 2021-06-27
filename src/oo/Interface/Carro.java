
package oo.Interface;

public class Carro {

        //private só membros da classe acessam
    private double aceleracao = 0;
    protected final double VELOCIDADE_MAXIMA;

    
    protected Carro(double velocidade_maxima) {
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }
    
    //protected, só quem é herança e/ou fazem parte do mesmo pacote pode acessar
    protected boolean acelerar(){
            aceleracao = aceleracao + 5;   
        return true;
    }
    
    protected boolean frear(){
        aceleracao = aceleracao - 5;
        return true;
    }
    
    protected double getAceleracao(){
        return aceleracao;
    }
    
    protected void setAceleracao(double aceleracao){
        this.aceleracao  = aceleracao;
    }
    
    @Override//Quando eu chamar o objeto, por padrão vai aparecer essa mensagem
    public String toString(){
        return "Aceleração atual "+aceleracao+"Km/h";
    }
}
