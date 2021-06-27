package Colecoes.Treinando;

public class Carro {

	private String modelo;
	private String nome;
	
	public Carro(String modelo, String nome) {
		this.modelo = modelo;
		this.nome = nome;
	}
	
	public Carro() {
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
