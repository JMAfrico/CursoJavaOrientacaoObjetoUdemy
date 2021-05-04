package oo.abstrato;

public class TesteAnimal {

    public static void main(String[] args) {
        
        Animal boby = new Cachorro();
        Animal willy = new Baleia();
        
        System.out.println(boby.andar());
        System.out.println(boby.respirar());
        System.out.println(willy.andar());
    }
    
    
}
