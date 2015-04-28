package com.beak.lists;

public class TesteAdicionaFim {

	public static void main(String[] args) {
		Itens item1 = new Itens("Poste");
		Itens item2 = new Itens("Mesa");
		Itens item3 = new Itens("Tenis");
		Itens item4 = new Itens("Geladeira");
		Itens item5 = new Itens("Cofre");
		
		DList lista = new DList();
		
		lista.adiciona(item1);
		lista.adiciona(item2);
		lista.adiciona(item3);
		
		lista.adicionaInicio(item4);
		lista.adiciona(item5);
		
		System.out.println(lista);
		 

	}

}
