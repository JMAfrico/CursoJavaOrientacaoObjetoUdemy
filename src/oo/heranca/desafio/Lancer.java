package oo.heranca.desafio;


public class Lancer extends Carro{

    protected Lancer(double veloc_max) {//chamo o consutrutor da classe pai, onde diz que a velocidade maxima vai ser passado na chamada do objeto
        super(veloc_max);
    }

    
    @Override
    protected boolean acelerar() {
        boolean acelerou = true;//crio uma variavel para alterar o valor boolean da classe pai
        aceleracao = aceleracao + 12;
        
         if ((aceleracao + 12) > VELOCIDADE_MAXIMA) {
            aceleracao = VELOCIDADE_MAXIMA;
        }
        else{
            aceleracao = aceleracao + 12;
        }
        return acelerou;
    }

    @Override
    protected boolean frear() {
        return super.frear(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
