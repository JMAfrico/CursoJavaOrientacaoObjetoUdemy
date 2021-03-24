
package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSetBaguncado {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2);// double , converte para Double(de primitivo para Wrapper)
        conjunto.add("Nome");
        conjunto.add(true);
        conjunto.add(1);
        conjunto.add('x');
                
        //Quantidade de itens na coleção
        System.out.println(conjunto.size());
        System.out.println(conjunto);//mostra todos os valores da colecao
        
        //Não adiciona items repetidos     
        conjunto.add('x');
        System.out.println(conjunto.size());
        
        //Remover itens
        System.out.println(conjunto.remove('x'));// se retornar true, é pq o item foi encontrado e removido
        System.out.println(conjunto.size());
        
        //Verificar se existe na lista
        System.out.println(conjunto.contains("Nome"));// se retornar true, é pq o item foi encontrado
        
        Set nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
         System.out.println(nums);
         
         //união entre 2 conjuntos
         //conjunto.addAll(nums);
         //System.out.println(conjunto);
         
         //interseção entre 2 conjuntos, só mostra os valores que são iguais nos dois
         conjunto.retainAll(nums);
         System.out.println(conjunto);
         
         
         //limpa a coleção
         conjunto.clear();
         System.out.println(conjunto);
    }
}
