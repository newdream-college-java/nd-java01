package java19;

import java.util.LinkedList;

//import org.omg.CORBA.Object;

public class Queue {
	LinkedList<Object> m=new LinkedList<Object>();
	public void add(Object b){//Ìí¼Ó  ·½·¨
		m.add(b);
	}
	public Object get(){
		m.removeLast();
		return m.removeLast();
		
	}
	
}
