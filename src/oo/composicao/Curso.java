package oo.composicao;

import java.util.ArrayList;

public class Curso {
        final String curso;
        final ArrayList<Aluno>alunos = new ArrayList();
        
        //Método construtor curso
         Curso(final String curso){
            this.curso = curso;
        }
        
        //Método adiciona curso ao Aluno
        void adicionaAluno(Aluno aluno){
            this.alunos.add(aluno);
            aluno.curso.add(this);
        }
}
