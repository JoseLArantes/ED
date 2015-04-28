package com.beak.lists;

public class TesteAdicionaInicio {

	public static void main(String[] args) {
		Itens item1 = new Itens("Geladeira");
		Itens item2 = new Itens("Carro");
		DList lista = new DList();
		lista.adicionaInicio(item1);
		lista.adicionaInicio(item2);
		System.out.println(lista);
		

	}

}
