package Arrays;

import java.util.Arrays;

public class Exercicio {
    
    public static void main(String[] args) {
        
        
        //MÉTODO MAIS COMUM DE ARRAY DE 1 DIMENSÃO
        
        //Array de uma dimensão
        double[] notasAlunoA = new double[3];
        
        //Acessando os valores através de seus indíces
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 7;

        /*Utilizando o Método Arrays.toString e passando como parâmetro o arrays criado, consigo acessar os 
        valores*/
        System.out.println("Notas do aluno João "+ Arrays.toString(notasAlunoA));
       
        //Percorrendo o Array com looping For, somando as notas    
        double total = 0;
        for (int i = 0; i < 3; i++)
        {     
            total = total + notasAlunoA[i];
        }
        //A nota Final deve estar fora do looping
        System.out.println("Média Total = " + total/3);
        
        //percorrendo o array e somando as notas com o tamanho da Listas, dividindo o total pelo tamanho do array
        double totalAluno = 0;
        for (int i = 0; i < notasAlunoA.length ; i++)
        {     
            totalAluno = totalAluno + notasAlunoA[i];
        }    
        System.out.println("Média Total = " + totalAluno/notasAlunoA.length);
        
        
        //-----------------------------------------------------------//
        //MÉTODO MENOS COMUM EM ARRAY DE 1 DIMENSÃO
        double[] notasAlunoB = {6.9,5.5,10,9.9};
        double d =0;
        System.out.println("Notas do aluno Elen "+ Arrays.toString(notasAlunoB));
        
        for (int i = 0; i < notasAlunoB.length; i++) {
            d =+ notasAlunoB[i];           
        }      
         System.out.println("Média Total = " + d/notasAlunoB.length);

    }
}
