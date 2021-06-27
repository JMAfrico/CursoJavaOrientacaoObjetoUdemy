package Colecoes.Treinando;

public class ExecutarCompra {

	public static void main(String[] args) {
		
		//-------------------------------------
		/*TESTE COMPRANDO CARRO SEM CLIENTE
		 
		ListaCarro teste = new ListaCarro(new Carro("Fiat","Palio"),2);
		
		System.out.println("Marca: "+teste.carro.getModelo());
		System.out.println("Modelo: "+teste.carro.getNome());
		System.out.println("Quantidade: "+teste.quantidade);
		*/
		//-------------------------------------
		
		//-------------------------------------
		// TESTE COMPRANDO CARRO COM CLIENTE
		CompraCarro novaCompra = new CompraCarro();		
		Comprador comprador = new Comprador("João","474119312");//nome do comprador
		
		novaCompra.adicionarCarro(new Carro("Fiat","Palio"),2);//(Carro) > (ListaCarro + quantidade) > (CompraCarro) 
		comprador.compraCarro.add(novaCompra); // Comprador adiciona lista de CompraCarro
		
		System.out.println(comprador.getNome());
		
		//
	}
}
