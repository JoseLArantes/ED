package com.beak.stacks;

public class Itens {
	private String nome;
	private double peso;
	
	public Itens(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public String toString(){
		return this.nome;
	}
	
}
