
package oo.composicao;

//primeiro, classe produto onde fica armazenado
//a descricao,preco e quantidade
public class Produto {
    String nome;
    int qt;
    double preco;

    public Produto(String nome,int qt, double preco) {
        this.nome = nome;
        this.qt = qt;
        this.preco = preco;
    }
    
    
}
