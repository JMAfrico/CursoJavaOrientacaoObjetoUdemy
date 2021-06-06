package oo.Gererics;

import java.time.Clock;

public class caixaGenerics <T> {

            private T coisa;
        
        public void setCoisa(T coisa){
            this.coisa = coisa;
        }
        
        public T getCoisa(){
            return coisa;
        }
}
