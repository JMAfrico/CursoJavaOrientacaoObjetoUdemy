package oo.composicao;

import java.util.ArrayList;


public class Aluno_Curso {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Elen");
        
        Curso curso1 = new Curso("Matematica");
        Curso curso2 = new Curso("TI");
        Curso curso3 = new Curso("Contabilidade");
        
        aluno1.curso.add(curso1);
        aluno1.curso.add(curso1);
        aluno2.curso.add(curso3);
        
        curso1.alunos.add(aluno1);
        curso1.alunos.add(aluno2);
        curso1.alunos.add(aluno3);
        
        for(Aluno aluno: curso1.alunos){
            System.out.println("O Aluno "+aluno.nome+" Está matriculado no curso de TI ");
        }
        
    }
}
