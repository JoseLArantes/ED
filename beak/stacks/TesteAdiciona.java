package com.beak.stacks;

public class TesteAdiciona {

	public static void main(String[] args) {
		Itens item1 = new Itens("1");
		Itens item2 = new Itens("2");
		Itens item3 = new Itens("3");
		Itens item4 = new Itens("4");
		Itens item5 = new Itens("5");
		
		DStack pilha = new DStack();

		String a = "Uma";
		String b = "mensagem";
		String c = "confidencial";
		
		for (int x=0;x<a.length();x++){
			pilha.Adicionar(a.charAt(x));
		}
		
		
		System.out.println(pilha);
		
	}

}
