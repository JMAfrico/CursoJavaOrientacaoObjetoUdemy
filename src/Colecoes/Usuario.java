/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecoes;

import java.util.Objects;


public class Usuario {
    
    String nome;
    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    public String Padrao(){
        return "Usuário "+ nome+ ".";
    }
        


//Passo o objeto equals, e se o que estiver dentro dos parametros 
//for um objeto quando chamado, ele vai verificar se é um objeto
// e se for um objeto, ele vai comparar se é uma chamada da variavel nome
//se for vai comparar a chamada do objeto.nome com o objeto nome que voce chamou
    @Override
    public boolean equals(Object o) {
        
        Usuario comparacao = (Usuario) o;
        boolean nomeIgual = this.nome.equals(comparacao.nome);
        return nomeIgual; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //Método que traz o true ou false do equals, atravéz de uma verificação
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

 
    
    
}
