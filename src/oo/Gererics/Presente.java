
package oo.Gererics;


public class Presente<X> extends caixaGenerics<X>{

        private X nomePessoa;
        

    public void setNomePessoa(X nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public X getNomePessoa() {
        return nomePessoa;
    }
    
 
}
