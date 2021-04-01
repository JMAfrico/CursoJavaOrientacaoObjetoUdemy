package oo.composicao;

import javax.swing.JOptionPane;

public class CompraTeste {
    
    public static void main(String[] args) {
        
        //1-instâncio uma nova compra(lembre-se dentro da classe compra,
       //tem uma lista de produtos instânciada).
        Compra compra = new Compra();

        //2-Crio o cliente
        String n = JOptionPane.showInputDialog("");
        Cliente cliente = new Cliente(n);
        
        //3-Chamo o objeto da nova compra, e dentro da nova compra chamo o objeto produtos
        //que criei. Chamo a propriedade adicionar e instâncio um novo produto, chamando o método
        //construtor, passando como parâmetro as variáveis
        compra.produtos.add(new Produto("Note",2, 199.90));
        compra.produtos.add(new Produto("TECLADO", 3 ,79.90));
        compra.produtos.add(new Produto("MOUSE ",4 , 48.90));
        
        System.out.println("Nome do cliente= "+ cliente.nome);
        JOptionPane.showConfirmDialog(null, n);
        System.out.println("Valor total da compra= "+ compra.total());
        
    }
}
