package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {

       Queue <String> fila = new LinkedList<String>();
           
        fila.add("ANA");//Adiciona Ana na fila ( Primeira que chegou ao banco)
        fila.offer("BIA");//Adiciona Bia na fila , mas se a fila não estiver cheia//Retorna true or false, false se não foi adicionada
        fila.add("CARLOS");
        fila.offer("DANIEL");
        fila.add("JOAO");//
        
        fila.peek();//retorna o próximo elemento da fila, sem deletar
        System.out.println(fila.peek());//se a lista está vazia, retorna null
        System.out.println(fila.element());//procura o elemento, caso não encontre da erro(exception)
        
       // System.out.println(fila.size());// tamanho da fila
        //fila.clear(); limpa a fila
        //System.out.println(fila.isEmpty());// verifica se a fila está vazia, retorna true ou false;
        //System.out.println(fila.contains("ANA"));// verifica se o item contem na fila
        
        System.out.println(fila.remove());//Retorna o primeiro elemento da fila e remove, porém da erro qdt fila esta vazia
        System.out.println(fila.poll());//Retorna o primeiro elemento da fila e remove
        System.out.println(fila.poll());//Retorna o primeiro elemento da fila e remove
        System.out.println(fila.poll());//Retorna o primeiro elemento da fila e remove
        System.out.println(fila.poll());//Retorna o primeiro elemento da fila e remove
        System.out.println(fila.poll());//Retorna o primeiro elemento da fila e remove
        
        /*public boolean filaCheia() que retorna true ou false caso esse if que eu lhe mostrei dê true ou false... */
    }
}
