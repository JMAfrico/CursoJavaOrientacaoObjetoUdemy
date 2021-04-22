package oo.heranca.desafio;


public class Lancer extends Carro{

    @Override
    public boolean acelerar() {
        boolean acelerou = true;//crio uma variavel para alterar o valor boolean da classe pai
        aceleraçao = aceleraçao + 12;
        return acelerou;
    }

    @Override
    public boolean frear() {
        return super.frear(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
