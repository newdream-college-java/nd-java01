package 第20章集合作业_泛型;

import java.util.ArrayList;
import java.util.List;


public class Stock<T> {
	ArrayList<T> list; //这句代码的意思是申明一个ArryList类型的数组
	
	
	//设置一个仓库，能够储存所有类型的数据。
	//并且取出对象后不需要转型就可以调用对象的所有方法。
	public Stock(){
		//这个构造函数初始化list使得list成为一个泛型ArryList
		this.list=new ArrayList<T>();
		
	}
	//这里加上了泛型，所以需要重写list的add方法和getList的方法
	public void add(T t){
		this.list.add(t);
	}
	 public List<T> getList(){
	        return this.list;
	    }
	
}	
