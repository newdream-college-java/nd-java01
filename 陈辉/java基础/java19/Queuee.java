package java19;
import java.util.LinkedList;
public class Queuee {
	public LinkedList <Object>list;
	public Queuee(){
		this.list=new LinkedList<Object>();
	}
	public void add(Object obj){
		this.list.add(obj);

	}
	public Object get(){
		return this.list.removeFirst();

	}


}
