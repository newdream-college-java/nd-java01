import java.util.LinkedList;


public class Queue {
	LinkedList ll=new LinkedList<>();
	
	
	public void add(Object obj){
		ll.addFirst(obj);
		
	}
	public Object get(){
		return ll.removeFirst();
	}
	public static void main(String[] args) {
		
	}
	
}
