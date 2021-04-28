package oo.Interface;

public class Fiesta extends Carro implements Esportivo,Luxo{

    private boolean arLigado = false;
    private boolean turboLigado = false;
    private boolean acelerou = false;
    
        protected Fiesta(){
        this(150);//chamo o construtor de baixo, como referencia do this "this(120)" é o mesmo que "fiesta(int velocidadeMaxima)"do construtor abaixo
    }
    
    protected Fiesta(int velocidadeMaxima){
        super(150);
    }
    
    @Override
    protected boolean acelerar() {
        
        if(turboLigado && !arLigado){
            setAceleracao(getAceleracao()+25);
        }
        else if (turboLigado && arLigado) {
            setAceleracao(getAceleracao()+20);
        }       
        else if(!turboLigado && !arLigado){
            setAceleracao(getAceleracao()+15);
        }
        else if(!turboLigado && arLigado){
            setAceleracao(getAceleracao()+10);
        }
        return acelerou = true;
    }

    @Override
    protected boolean frear() {
        return super.frear(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ligarTurbo() {
        turboLigado = true;

    }
    
    @Override
    public void desligarTurbo() {
        turboLigado = false;
    }

    @Override
    public void ligarArCondicionado() {
        arLigado = true;
    }

    @Override
    public void desligarArCondicionado() {
            arLigado = false;
    }




}
