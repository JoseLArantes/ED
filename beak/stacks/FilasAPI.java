package com.beak.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class FilasAPI<T> {
	private LinkedList<T> Fila = new LinkedList<T>();
	
	
	public void insere(T o){
		this.Fila.add(o);
	}
	
	public T remove(){
		if (!vazia()){
			return this.Fila.remove(0);
		} else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean vazia(){
		return this.Fila.size()==0;
	}
	
	public int tamanho(){
		return this.Fila.size();
	}
	
	
	
}


class TesteFilasAPI{
	public static void main(String[] args) {
		
		FilasAPI<Object> fila = new FilasAPI<Object>();
		
		String f = "Bom ";
		String g = "dia";
		String h = "companheiros";

		fila.insere(f);
		fila.insere(g);
		fila.insere(h);
		
		System.out.println(" ");
	
		for (int x=0;x<=fila.tamanho()+1;x++){
			Object w = fila.remove();
			System.out.println(w);
		}
		
		
		/////
		
		Queue<Object> filaAPI = new LinkedList<Object>();
		
		Itens item1 = new Itens("Abóbora");
		Itens item2 = new Itens("Chuchu");
		Itens item3 = new Itens("Melancia");
		Itens item4 = new Itens("Batata");
		
		
		filaAPI.add(item1);
		filaAPI.add(item2);
		filaAPI.add(item3);
		filaAPI.add(item4);

		
		System.out.println(filaAPI);
		
		System.out.println(filaAPI.poll());
		
		System.out.println(filaAPI);
		

	}
	
	
}