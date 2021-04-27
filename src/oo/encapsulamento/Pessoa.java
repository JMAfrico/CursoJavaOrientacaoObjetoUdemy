package oo.encapsulamento;


public class Pessoa {

    private static int idade;
    
    public Pessoa(int idade){ // construtor recebendo por parametro uma idade, que vem do método setIdade
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >=0 ) {
            this.idade = idade;
        }
        else
            System.out.println("idade inválida, deve ser maior que 0");
    }
    
    
}
