package com.beak.stacks;

public class DStack {
	private DStackNode top;
	private int size = 0;
	
	public void Adicionar(Object o){
		DStackNode novo = new DStackNode(o);
		novo.setNext(this.top);
		this.top = novo;
		this.size++;
	};
	
	public Object getItem(int posicao){
		if (!posicaoOcupada(posicao)){
			throw new IndexOutOfBoundsException();
		}
		DStackNode atual = this.top;
		for (int x=1;x<posicao;x++){
			if (x == posicao){
				return atual.getItem();
			}
			atual = atual.getNext();
		}
		return atual.getItem();
	}
	
	public void retira(){
		this.top = this.top.getNext();
		this.size--;
	}
	
	
	public int getSize(){
		return this.size;
	}
	
	private boolean posicaoOcupada(int posicao){
		return (posicao >0 && posicao <= this.size);
	}
	
	private boolean emptyStack(){
		return (this.size == 0);
	}
	
	
	public String toString(){
		if (emptyStack()){
			return "[ ]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		DStackNode atual = this.top;
		for (int x=1;x<=this.size;x++){
			builder.append(atual+" ");
			atual = atual.getNext();
		}
		builder.append("]");
		
		return builder.toString();
	}
	

}
