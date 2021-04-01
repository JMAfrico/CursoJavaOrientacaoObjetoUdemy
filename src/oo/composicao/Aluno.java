package oo.composicao;

import java.util.ArrayList;

//Exemplo muitos para muitos
public class Aluno {
    final String nome;
    final ArrayList<Curso>curso = new ArrayList();

    Aluno(String nome) {
        this.nome = nome;
    }
   
    //Método adiociona um curso ao Aluno
     void adicionaCurso(Curso curso){
     this.curso.add(curso);
     curso.alunos.add(this);
        }
}
