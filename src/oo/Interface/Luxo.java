package oo.Interface;

public interface Luxo {
    
        public void ligarArCondicionado();
        public void desligarArCondicionado();
        
        //Quando um metodo  default e implementado , as classes filhas nao sao obrigadas a declarar os metodos da interface
        default int nivelAr(){
            return 1;
        };
}
