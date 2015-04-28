package com.beak.lists;

public class TesteRemoveItem {

	public static void main(String[] args) {
		Itens item1 = new Itens("Poste");
		Itens item2 = new Itens("Mesa");
		Itens item3 = new Itens("Tenis");
		Itens item4 = new Itens("Geladeira");
		Itens item5 = new Itens("Cofre");
		Itens item6 = new Itens("Panela");
		Itens item7 = new Itens("Carro");
		
		DList lista = new DList();
		
		lista.adiciona(item1);
		lista.adiciona(item2);
		lista.adiciona(item3);		
		lista.adicionaInicio(item4);
		lista.adiciona(item5);
		lista.adiciona(item6, 4);
		lista.remove(1);
		System.out.println(lista);
		//Remove by position
		lista.remove(3);
		System.out.println(lista);		
		lista.adiciona(item6);
		System.out.println(lista);
		//Remove by Item
		lista.remove(item1);
		System.out.println(lista);
		//Do nothing since there`s no item matching
		lista.remove(item7);
		System.out.println(lista);
		


		System.out.println(lista.getItem(1));

	}

}
