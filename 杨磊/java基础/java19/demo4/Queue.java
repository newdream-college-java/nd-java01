package com.nd.yl.demo4;

import java.util.LinkedList;

public class Queue {
	LinkedList<Object> a = new LinkedList<Object>();

	public void add(Object obj) {
		a.addFirst(obj);
	}

	public Object get() {
		Object j = a.getLast();
		a.removeLast();
		return j;

	}
}
