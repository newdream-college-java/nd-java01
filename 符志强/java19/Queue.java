package ื๗าต;

import java.util.LinkedList;

public class Queue {
	LinkedList list;
	public Queue() {
		this.list=new LinkedList();
	}
	void add(Object obj){
		this.list.add(obj);
	}
	Object get(){
		return this.list.removeFirst();
		
	}
}
