package com.beak.lists;

public class TesteAdicionaPosicao {

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
		
		System.out.println(lista);
		
		lista.adiciona(item6, 4);
		
		System.out.println(lista);
		
		System.out.println(lista.getSize());
		
		lista.remove(1);
		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);		
		lista.adiciona(item6);

		System.out.println(lista);

		lista.remove(item1);
		System.out.println(lista);
		
		lista.remove(item7);
		System.out.println(lista);
		
		System.out.println(lista.getItem(1));
		
		Thread.dumpStack();
		
		
	}

}
