package oo.abstrato;


public class Cachorro extends Mamifero{

    @Override
    public String andar(){
        return "usando patas";
    };

    @Override
    public String respirar() {
        return super.respirar(); 
    }
    
    
    

}
