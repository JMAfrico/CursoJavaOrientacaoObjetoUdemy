package Colecoes.Treinando;

import java.util.ArrayList;

public class Comprador {

	private String nome,cpf;
	ArrayList<CompraCarro> compraCarro = new ArrayList<>();
	
	public Comprador() {
		
	}
	
	public Comprador(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}

