package com.beak.lists;

public class DList {
	private DListNode head;
	private DListNode tail;
	private int size = 0;

	public void adiciona(Object o) {
		if (this.size == 0) {
			adicionaInicio(o);
		} else {
			DListNode novo = new DListNode(o);
			novo.setPrev(this.tail);
			this.tail.setNext(novo);
			this.tail = novo;
			this.size++;
		}
	}

	public void adicionaInicio(Object o) {
		DListNode novo = new DListNode(o);
		if (this.size == 0) {
			this.head = novo;
			this.tail = novo;
		} else {
			novo.setNext(this.head);
			this.head.setPrev(novo);
			this.head = novo;
		}
		this.size++;
	}

	public void adiciona(Object o, int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IndexOutOfBoundsException();
		}

		if (posicao == 1) {
			adicionaInicio(o);
		} else if (posicao == this.size) {
			adiciona(o);
		} else {
			DListNode atual = this.pegaPosicao(posicao);
			DListNode novo = new DListNode(o);
			novo.setPrev(atual.getPrev());
			atual.getPrev().setNext(novo);
			atual.setPrev(novo);
			novo.setNext(atual);
			this.size++;
		}
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IndexOutOfBoundsException();
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else if (posicao == this.size) {
			this.tail.getPrev().setNext(null);
			this.tail = this.tail.getPrev();
		} else if (posicao == 1) {
			this.head.getNext().setPrev(null);
			this.head = this.head.getNext();
		} else {
			DListNode atual = this.pegaPosicao(posicao);
			atual.getPrev().setNext(atual.getNext());
			atual.getNext().setPrev(atual.getPrev());
		}
		this.size--;
	}

	public void remove(Object o) {
		DListNode atual = this.head;
		if (listaVazia()){
			throw new IndexOutOfBoundsException();
		}
		if (o.equals(this.tail.getItem())) {
			remove(this.size);
		} else {
			for (int x = 1; x <= this.size - 1; x++) {
				if (o.equals(atual.getItem())) {
					remove(x);
				} else {
					atual = atual.getNext();
				}
			}
		}
	}

	public boolean posicaoOcupada(int posicao) {
		return (posicao > 0 && posicao <= this.size);
	}
	
	private boolean listaVazia(){
		return (this.size == 0);
	}

	private DListNode pegaPosicao(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IndexOutOfBoundsException();
		}
		DListNode atual = this.head;
		if (posicao == this.size) {
			return this.tail;
		} else {
			for (int x = 1; x <= posicao; x++) {
				if (x == posicao) {
					return atual;
				} else {
					atual = atual.getNext();
				}
			}
		}
		return atual;
	}

	public int getSize(){
		return this.size;
	}
	
	public Object getItem(int posicao){
		return pegaPosicao(posicao).getItem();
	}
	
	public String toString() {
		if (this.size == 0) {
			return "[ ]";
		}
		StringBuilder builder = new StringBuilder("[ ");
		DListNode atual = this.head;
		for (int x = 1; x <= this.size - 1; x++) {
			builder.append(atual.getItem() + ", ");
			atual = atual.getNext();
		}
		builder.append(atual.getItem() + " ]");
		return builder.toString();
	}
}

