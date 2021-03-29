package Colecoes;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<Usuario> users = new HashSet<>();
        
        users.add(new Usuario("Joao"));
        users.add(new Usuario("Pedro"));
        users.add(new Usuario("Ana"));
        users.add(new Usuario("Guilherme"));
        
        //pede uma entrada de nome de usuario
        String nome = JOptionPane.showInputDialog("Digite nome para adicionar");
        
        //usa o método Hashcode da Classe usuário para verificar se o obejto existe
        boolean resultado = users.contains(new Usuario(nome));
        
        //se o usuario não existe, ele adiciona, se existe não adiciona
        if (resultado==false) {
            users.add(new Usuario(nome));
            JOptionPane.showMessageDialog(null,"Usuário Adicionado");
        }
        else
            JOptionPane.showMessageDialog(null,"Usuário já existe");    
        
        //Procura na classe usuarios, os nomes que estão lá e apresentam aqui
        for(Usuario nomes:users){
        JOptionPane.showMessageDialog(null, nomes.nome);
        }
    }
    
    
}
