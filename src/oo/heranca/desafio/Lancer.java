package oo.heranca.desafio;


public class Lancer extends Carro{

    protected Lancer(double veloc_max) {//chamo o consutrutor da classe pai, onde diz que a velocidade maxima vai ser passado na chamada do objeto
        super(veloc_max);
    }

    
    @Override
    protected boolean acelerar() {
        boolean acelerou = true;//crio uma variavel para alterar o valor boolean da classe pai
        aceleraçao = aceleraçao + 12;
        
         if ((aceleraçao + 12) > VELOCIDADE_MAXIMA) {
            aceleraçao = VELOCIDADE_MAXIMA;
        }
        else{
            aceleraçao = aceleraçao + 12;
        }
        return acelerou;
    }

    @Override
    protected boolean frear() {
        return super.frear(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
