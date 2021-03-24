
package Classes;

import java.util.Objects;

public class Usuario {
    
    String nome;
    String email;

    public boolean equals(Object objeto) {
        //definindo o critério de igualdade
        //Se o objeto for uma intancia de usuário

                 Usuario outro = (Usuario) objeto;//cast//Conversão implicita para poder igualar as duas comparações
                 boolean nomeIgual = this.nome.equals(outro.nome);//verifico pela caracteristica nome, se o objetto instanciado é igual 
                 boolean emailIgual = this.email.equals(outro.email);//verifico pela caracteristica nome, se o objetto instanciado é igual 
                 
                 return nomeIgual && emailIgual;

    }
    
    
}
