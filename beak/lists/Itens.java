package com.beak.lists;

public class Itens {
	private String nome;

	public Itens(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return this.nome;
	}
	
	public boolean equals(Object o){
		Itens outro = (Itens)o;
		return this.nome.equals(outro.getNome());
	}
}
