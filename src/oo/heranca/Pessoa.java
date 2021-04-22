package oo.heranca;

public class Pessoa {

    private String nome;
    private int idade;
    
    public void DadosPessoais(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    
    
    
}
