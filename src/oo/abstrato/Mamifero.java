package oo.abstrato;


public abstract class Mamifero extends Animal{
    
    @Override
    public abstract String andar();

    @Override
    public String respirar() {
        return super.respirar(); 
    }
    
    
}
