package Colecoes;

import java.util.HashMap;
import java.util.Map;



public class Mapa {
    
    public static void main(String[] args) {
        
        //estrutura chave-valor(como se fosse uma tabela BD, com chave primaria e valor)
        Map<Integer,String> usuario = new HashMap<>();
        
        //adiciona no indice 1, o valor Joao
        usuario.put(1,"Joao");
        
        //altera o indice 1 para Maria
        usuario.put(1,"Maria");
        usuario.put(2,"Roberto");
        usuario.put(3,"Francisco");
        usuario.put(4,"Renata");
        
        System.out.println(usuario);//nomes e chaves
        System.out.println(usuario.size());//tamanho
        System.out.println(usuario.isEmpty());//está vazio?
        System.out.println(usuario.keySet());//retorna as chaves utilizadas
        System.out.println(usuario.values());//retorna os valores existentes
        System.out.println(usuario.entrySet());//retorna os valores existentes
        System.out.println(usuario.containsKey(5));//verifica se aquela chave existe
        System.out.println(usuario.containsValue("Joao"));//verifica se aquele valor existe
        
        if(usuario.containsKey(5)== false){
            if (usuario.containsValue("Joao")==false) {
                usuario.put(5,"João");
               
            }
        }
         System.out.println("Agora "+usuario.get(5)+" Foi adicionado");//retorna o valor da chave
        System.out.println(usuario.entrySet());
            
        //percorrendo as chaves
        for(int chave: usuario.keySet()){
            System.out.println("Chaves="+chave);
        }
        
        //percorrendo os valores
        for(String usuarios: usuario.values()){
            System.out.println("Valores="+usuarios);
        }
        
        //percorrendo chave e valores
        for(int i = 1; i <= usuario.size(); i++){
         System.out.println(i + " - " + usuario.get(i));
        }
        //ou
        for (Map.Entry<Integer, String> user : usuario.entrySet()) {
            System.out.print(user.getKey());
            System.out.println("-"+user.getValue());
        }
        
        System.out.println(usuario.remove(1));//remove a chave
        System.out.println(usuario.remove(1,"Joao"));//remove a chave de o valor for esse

    }

}
