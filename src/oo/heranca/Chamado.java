package oo.heranca;


public class Chamado {

    public static void main(String[] args) {
        Pessoa p1 = new Cliente();
        Pessoa p2 = new Funcionario();
        
        
        p1.DadosPessoais("João",30);
        p2.DadosPessoais("Elen",31);
        
        
        System.out.println(p1.getNome()+" foi atendido por "+p2.getNome());
        System.out.printf("%s foi atendido por %s",p1.getNome(),p2.getNome());

       Produto produto =  new Produto("Notebook",1890.00);
       
        System.out.printf("\n%s Comprou o produto %s pelo preco de %2.2f",p1.getNome(),produto.getNome(),produto.getPreco());
        
        
    }
}
