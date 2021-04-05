package oo.composicao.desafio;

public class CompraMain {
    public static void main(String[] args) {
        
        //nome do cliente
        Cliente clienteJoao = new Cliente("João marcos");
        
        //efetuar nova compra
        Compra compra1 = new Compra();
        
        //chamar o método adicionar item, que contem um produto que entra na lista de itens
        compra1.adicionarItem("Macarrão Instântaneo", 5.50, 3);
        compra1.adicionarItem(new Produto("Geladeira", 1250.00) , 3);
        
        Compra compra2 = new Compra();
        compra2.adicionarItem("Macarrão Instântaneo", 5.50, 3);
        compra2.adicionarItem(new Produto("Geladeira", 1050.00) , 2);
        
        clienteJoao.compra.add(compra1);
        clienteJoao.compra.add(compra2);
        
        System.out.println(clienteJoao.getTotalCompras());
        
    }
}
