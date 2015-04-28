package com.beak.stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjuntos<T> {
	private int tamanho = 0;
	private List<List<T>> tabelaHash = new ArrayList<List<T>>();

	public Conjuntos(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			List<T> lista = new LinkedList<T>();
			tabelaHash.add(lista);
		}
	}
/*
	public int calculaCodigoDeEspalhamento(String palavra){
		int codigo = 1;
		for (int i=0;i<palavra.length();i++){
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}
	*/
	public int calculaIndiceDaTabela(T palavra) {
		int codigoDeEspalhamento = this.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento%this.tabelaHash.size();
		//return palavra.toString().toLowerCase().charAt(0) % 26;
	}

	public void adicionar(T o) {
		if (!this.contem(o)) {
			this.verificaCarga();
			//List<Object> lista = (List<Object>) this.tabelaHash.get(this.calculaIndiceDaTabela(o));
			List<T> lista = (List<T>) this.tabelaHash.get(this.calculaIndiceDaTabela(o));
			lista.add(o);
			tamanho++;
		}

	}

	public boolean contem(T o) {
		List<T> lista = (List<T>) this.tabelaHash.get(this
				.calculaIndiceDaTabela(o));
		return lista.contains(o);
	}

	public void getElemento(T o) {
	}

	public List<T> pegaTodas() {
		List<T> conjuntoDePalavras = new ArrayList<T>();

		for (int i = 0; i < this.tabelaHash.size(); i++) {
			conjuntoDePalavras.addAll(this.tabelaHash.get(i));
		}

		return conjuntoDePalavras;
	}

	// public List<T> getAllElementos(){}
	public int totalElementos() {
		return this.tamanho;
	}

	public void remover(T o) {
		if (this.contem(o)) {
			List<T> lista = (List<T>) this.tabelaHash.get(this.calculaIndiceDaTabela(o));
			lista.remove(o);
			tamanho--;
			this.verificaCarga();
		}
	}
	
	public void imprimeTabela(){
		for (List<T> lista : this.tabelaHash){
			System.out.print("[");
			for (int x=0;x<lista.size();x++){
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
	
	private void redimensionaTabela(int novaCapacidade){
		List<T> palavras = this.pegaTodas();
		this.tabelaHash.clear();
		for (int x=0;x<novaCapacidade;x++){
			this.tabelaHash.add(new LinkedList<T>());
		}
		for (T palavra : palavras){
			this.adicionar(palavra);
		}
	}
	
	private void verificaCarga(){
		int capacidade = this.tabelaHash.size();
		double carga = (double)this.tamanho/capacidade;
		if (carga > 0.75){
			this.redimensionaTabela(capacidade*2);
		} else if (carga < 0.25){
			this.redimensionaTabela(Math.max(capacidade/2,5));
		}
	}
	
	
	
	public void imprimeTabelas(){
		for (List<T> lista : this.tabelaHash){
			//System.out.print("[");
			//for (int x=0;x<lista.size();x++){
				System.out.println(lista);
			//}
			//System.out.println("]");
		}
		
	}

}