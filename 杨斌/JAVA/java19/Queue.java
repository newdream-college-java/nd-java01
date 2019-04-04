package com.java.java19;

import java.util.LinkedList;

public class Queue  {
	public LinkedList <Object>list;
	public Queue(){
		this.list=new LinkedList<Object>();
	}
	public void add(Object obj){
		this.list.add(obj);
	
	}
	public Object get(){
		return this.list.removeFirst();
		
	}


	
}
