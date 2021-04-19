package oo.heranca;

import javax.swing.JOptionPane;


public class Chamado {

    public static void main(String[] args) {
        Pessoa p1 = new Cliente();
        Pessoa p2 = new Funcionario();
        
        p1.DadosPessoais("João",30);
        p2.DadosPessoais("Elen",31);
        
        System.out.println(p1.toString()+" foi atendido por :"+p2.toString());
    }
}
