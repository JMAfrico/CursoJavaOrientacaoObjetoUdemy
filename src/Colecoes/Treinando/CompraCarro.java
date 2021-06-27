package Colecoes.Treinando;

import java.util.ArrayList;

public class CompraCarro {

	ArrayList<ListaCarro> carros = new ArrayList<>();

	public void adicionarCarro(Carro carro,int quantidade) {
		this.carros.add(new ListaCarro(carro,quantidade));
		
	}
	
	
}
