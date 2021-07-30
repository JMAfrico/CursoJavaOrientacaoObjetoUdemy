
package Colecoes;

import Classes.Produto;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;


public class ConjuntoSetComportado {
    
    public static void main(String[] args) {
        
        //Minha lista entre as chaves menores e maiores
        //Significa que minha lista vai ser desse tipo
        //Set<String> listaAprovados = new HashSet<>(); // LISTA NAO ORDENADA
        
        SortedSet<String> listaAprovados = new TreeSet<>(); // LISTA ORDENADA
        
       listaAprovados.add("Ana");
       listaAprovados.add("Carlos");
       listaAprovados.add("Lucas");
       listaAprovados.add("Pedro");
       
       for(String nome: listaAprovados){
        System.out.println(nome);
           JOptionPane.showMessageDialog(null, nome);
       }
       
        Set<Integer> valores = new TreeSet<>(); // LISTA ORDENADA
        
        valores.add(5);
        valores.add(4);
        valores.add(3);
        valores.add(7);
       
       for(Integer notas: valores){
        System.out.println(notas);
           JOptionPane.showMessageDialog(null, notas);
       }
              
        Set<Produto> p2 = new TreeSet<>();
        
    }
}
