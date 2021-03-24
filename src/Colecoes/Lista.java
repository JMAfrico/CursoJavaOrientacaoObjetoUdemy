package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList();//Lista da Classe usuários
        
        //Novo objeto de usuário
        Usuario u1 = new Usuario("João");
        lista.add(u1);
        lista.add(new Usuario("Marcos"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Elen"));
        lista.add(new Usuario("Manu"));
        
        //Retorna o indice do usuário, utilizando o método Padrao criado na classe Usuario
        //System.out.println(lista.get(3).Padrao());
        
        //apaga o item de indice 1
       //lista.remove(1);

        //Mostra os usuários da lista
        for(Usuario i :lista){
            System.out.println(i.Padrao());
        }
        
        //VERIFICA SE TEM NA LISTA,UTILIZANDO HASHCODE E EQUALS
        System.out.println("TEM?"+lista.contains(new Usuario("Maria")));
        
         //Retorna e remove verdadeiro ou false, utilizando o método hashcode e equals porque é um objeto   
         System.out.println(lista.remove(new Usuario("MariaJ")));

        //Verifica se esse nome existe
        for(Usuario i :lista){
            System.out.println(i.Padrao());

        }
    }

}
