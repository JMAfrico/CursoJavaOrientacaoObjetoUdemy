
package Colecoes;

//LAST IN, FIRST OUT - ULTIMO ENTRAR, PRIMEIRO A SAIR

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { 
    
    public static void main(String[] args) {
        
        //INSTANCIANDO
        Deque<String> livros = new ArrayDeque<>();
        
        
        //ADICIONANDO
        //livros.add("O ESCORPIAO REI");//método adicionar, como resultado true ou false, dependendo da limitacao  
        livros.push("O ESCORPIAO REI");//método adicionar, como resultado true ou false, dependendo da limitacao  
        livros.push("MULAN");//método adicionar, porém com erro (EXCEPTION) quando bate no limite
        livros.push("O HOBBIT");
        livros.push("MÁGICO DE OZ");
        
        
        //APENAS LEITURA
        System.out.println(livros.peek()); // RETORNA O ULTIMO LIVRO ADICIONADO
        System.out.println(livros.peekFirst());//retorna o primeiro da pilha(ultimo adicionado)
        System.out.println(livros.peekLast());//retorna o ultimo da pilhao(primeiro adicionado)
        System.out.println(livros);//mostra toda a coleção de livros
        System.out.println("PRIMEIRO LIVRO(ultimo adicionado): "+livros.getFirst());
        System.out.println("ULTIMO LIVRO(primeiro adicionado): "+livros.getLast());
        
        //FOR EACH
        for(String livro: livros){
            System.out.println("Livros Lidos = "+livro);
        }
        
        //FOR EACH FUNCIONAL
        livros.forEach((livro) -> {
            System.out.println("Livros Lidos 2= "+livro);
        });
        
        //LEITURA E DELETE
       System.out.println(livros.poll());//retorna e remove o primeiro da pilha(ultimo adicionado)
        //System.out.println(livros.remove());//tambem retorna e remove o primeiro da pilha(ultimo adicionado)
        //System.out.println(livros.removeFirst());
        //System.out.println(livros.removeLast());
        //System.out.println(livros.pop());//tambem retorna e remove o primeiro da pilha(ultimo adicionado)       
        System.out.println(livros.pollFirst());//retorna e remove o primeiro da pilha(ultimo adicionado)
        System.out.println(livros.pollLast());//retorna e remove o ultimo da pilha(primeiro adicionado)
        
        //MÉTODO COMUNS
       // livros.contains();
        //livros.clear();
        //livros.isEmpty();
        //livros.size();

        
    }
}
