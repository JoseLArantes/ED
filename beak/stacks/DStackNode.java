package com.beak.stacks;

public class DStackNode {
	private Object item;
	private DStackNode next;
	private DStackNode prev;
	
	public DStackNode(Object o) {
		this.setItem(o);
	}
	
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public DStackNode getNext() {
		return next;
	}
	public void setNext(DStackNode next) {
		this.next = next;
	}
	public DStackNode getPrev() {
		return prev;
	}
	public void setPrev(DStackNode prev) {
		this.prev = prev;
	}
	
	public String toString(){
		return this.item.toString();
	}
		
}
