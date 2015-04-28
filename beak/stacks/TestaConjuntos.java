package com.beak.stacks;

public class TestaConjuntos {

	
	public static void main(String[] args) {
		Conjuntos<Itens> conjunto = new Conjuntos<Itens>(5);
		
		/*
		double inicio = System.currentTimeMillis();
		String a;
		for (int x=0;x<50000;x++){
			a = "palavra"+x;
			conjunto.adicionar(a);
		}
		
		for (int x=0;x<50000;x++){
			a = "palavra"+x;
			conjunto.contem(a);
		}
		
		double fim = System.currentTimeMillis();
		
		System.out.println(fim-inicio);
		
		
		
		conjunto.adicionar("Alfinete");
		conjunto.adicionar("Bolsa");
		conjunto.adicionar("Carteira");
		conjunto.adicionar("Dobradiça");
		conjunto.adicionar("Esmeralda");
		conjunto.adicionar("Almofada");
		conjunto.adicionar("Bola");
		conjunto.adicionar("Calça");
		conjunto.adicionar("Dado");
		conjunto.adicionar("Arcos");
		conjunto.adicionar("Baton");
		conjunto.adicionar("Zaton");
		conjunto.adicionar("Jaton");
		conjunto.adicionar("Aaton");
		*/

		conjunto.adicionar(new Itens("Carro"));
		conjunto.adicionar(new Itens("Corrente"));
		conjunto.adicionar(new Itens("Sapato"));
		conjunto.adicionar(new Itens("Alface"));
		conjunto.adicionar(new Itens("Jóia"));
		conjunto.adicionar(new Itens("Ruby"));
		conjunto.adicionar(new Itens("Ruby"));
		conjunto.adicionar(new Itens("Ruby"));
		conjunto.adicionar(new Itens("Ruby"));
		
		
		
		if (!conjunto.contem(new Itens("Ruby"))) {
			System.out.println("Não contem item pesquisado!");
		}

		if (conjunto.contem(new Itens("Alface"))){
			System.out.println("Tem alface no conjunto!");
		}
		System.out.println(conjunto.pegaTodas());
		System.out.println(conjunto.totalElementos());
		conjunto.remover(new Itens("Jóia"));
		System.out.println(conjunto.totalElementos());
		System.out.println(conjunto.pegaTodas());
		//for (int x=0;x<1000;x++){
		//	conjunto.adicionar(""+x);
		//}
		
		System.out.println("###################################");
		conjunto.imprimeTabelas();
		
		
		
	}
	
}
