//Pacote utilizado. Caso eu queira utilizar alguma classe de outro pacote
//tenho que importar o pacote aqui no inicio, por exemplo, package Fundamentos
//Se eu precisar utilizar uma classe que esteja no mesmo pacote, é só instanciar
package Classes;


public class ProdutoMain {
    
    public static void main(String[] args) {
        
        //instanciei um novo produto da classe produto
        Produto produto = new Produto();
        
        //com a notação . após o nome da instância, eu chamo os atributos ou métodos da classe 
        produto.nome = "TV";
        produto.preco = 1580.00;
        Produto.desconto = 0.3;
              
        //Calculo do preço do produto com desconto aplicado
        double totalFinal = produto.preco * (1-Produto.desconto);
        
        //Calculo do preço final do produto chamando o método
        System.out.printf("Preço do desconto(chamando método)R$%2.2f",produto.precoComDesconto());
        System.out.println("");
        
         //Calculo do preço final do produto chamando o método com parametro
        System.out.printf("Desconto do gerente(método com parametro)R$%2.2f",produto.precoComDesconto(0.05));
        
        //como saída devo usar printf
        //Primeiro :Escrevo toda a string como quero deixar
        //Segundo :Coloco o %s para String , %f para numero onde eu quero que seja substituido
        //Terceiro : Finalizo a string com virgula, e depois coloco as variaveis na ordem que espeífiquei 
        System.out.printf("\nProduto:%s \nPreço:%2.2f \nDesconto: %2.2f",produto.nome,produto.preco,Produto.desconto);
        
        //Valor final do produto com duas casas decimais
        System.out.printf("\nPreço Final = R$%2.2f.", totalFinal);
        System.out.println("");
        
        //CHAMANDO UM NOVO PRODUTO COM PARÂMETRO
        //classe                   //construtor
        Produto p2 = new Produto("Geladeira");
        p2.preco = 600.00;
        Produto.desconto = 0.5;
        
        Produto p3 = new Produto("Celular",500.00);
        Produto.desconto = 0.4;
        
        Produto p4 = new Produto("Notebook",1200.00,0.5);
        
        System.out.println(p2.nome+"-"+p2.preco+"-"+Produto.desconto); 
        System.out.println(p3.nome+"-"+p3.preco+"-"+Produto.desconto);
        System.out.println(p4.nome+"-"+p4.preco+"-"+Produto.desconto);
        
        
    }
}
