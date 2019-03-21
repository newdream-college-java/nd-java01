package exercise2;


import java.util.LinkedList;


public class Queue {
	
	LinkedList<Object> linkedList;
	public Queue() {
		linkedList=new LinkedList<>();
	}
	public int size() {
		return linkedList.size();
	}
	public void add(Object obj) {
		linkedList.addFirst(obj);
	}
	public Object get() {		
		return linkedList.removeLast();
	}
}
