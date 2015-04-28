package com.beak.stacks;

import java.util.LinkedList;
import java.util.List;

public class StackAPI<T> {
	private List<T> objetos = new LinkedList<T>();
	
	public T remove(){
		return this.objetos.remove(this.objetos.size()-1);
	}
	
	public T desempilha(){
		return this.objetos.remove(this.objetos.size()-1);
	}
	
	public T pegaDaPilha(){
		return this.objetos.get(this.size());
	}
	
	
	public void insere(T o){
		this.objetos.add(o);
	}
	
	public boolean vazia(){
		return this.objetos.isEmpty();
	}
	
	public T pega(int posicao){
		return this.objetos.get(posicao);
	}
	
	public int size(){
		return this.objetos.size();
	}
	
}


class TestStackAPI{
	public static void main(String[] args) {
		StackAPI<Object> pilha = new StackAPI<Object>();
		StackAPI<Object> encripta = new StackAPI<Object>();
		
		String frase = "to ligado que você gosta de sentar na fronha heim mano";
		int parou=0;

		for (int x=0;x<frase.length();x++){
			if (frase.charAt(x) == ' '){

				pilha.insere(frase.charAt(x));
				for (int y=x; y >=parou;y--){
					encripta.insere(pilha.pega(y));
				}	
				//encripta.insere(frase.charAt(x));
				parou = x;
			} else {
				pilha.insere(frase.charAt(x));
			}
			System.out.print(frase.charAt(x));
		}
		
		for (int x=pilha.size()-1; x>parou;x--){
			encripta.insere(pilha.pega(x));	
		}

		System.out.println(" ");

		for (int x=pilha.size()-1; x >=0;x--){
			System.out.print(pilha.pega(x));			
		}
		
		System.out.println(" ");
				
		for (int x=0; x < encripta.size();x++){
			System.out.print(encripta.pega(x));			
		}
				
			
	}
}