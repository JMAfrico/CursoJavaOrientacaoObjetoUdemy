package Lambdas;

import java.util.Arrays;
import java.util.List;

//Tenho uma lista de alunos
//Quero percorrer essa lista atravéz de Função Lambda
//Recebo um método que vou utilizar para utilizar
//1-Crio a lista,2-Crio o método,Crio a função(Method Reference 2)

public class Foreach {

    public static void main(String[] args) {
            
        List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");

        //ForEach Simples, percorre os itens da lista
        System.out.println("Forma tradicional");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        //ForEach Lambda
        System.out.println("Forma com Função Lambda 01");
        aprovados.forEach((nome)-> { System.out.println(nome);});
        
        //Method Reference, Percorre os itens da lista sem precisar atribuir uma variável
        System.out.println("Method Reference 01");
        aprovados.forEach(System.out::println);
        
        System.out.println("Forma com Função Lambda 02");
        aprovados.forEach((nome)-> Imprimir(nome));
        
        System.out.println("Method Reference 02");
        aprovados.forEach(Foreach::Imprimir);

    }
    
     //os métodos não podem ficar dentro do método Main
    // e para chamar fora do método, tem que aplicar o static
        static void Imprimir(String nome) {
        System.out.println("Meu nome é:" + nome);
        }
}
