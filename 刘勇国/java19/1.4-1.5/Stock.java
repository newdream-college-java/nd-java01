package ��20�¼�����ҵ_����;

import java.util.ArrayList;
import java.util.List;


public class Stock<T> {
	ArrayList<T> list; //���������˼������һ��ArryList���͵�����
	
	
	//����һ���ֿ⣬�ܹ������������͵����ݡ�
	//����ȡ���������Ҫת�;Ϳ��Ե��ö�������з�����
	public Stock(){
		//������캯����ʼ��listʹ��list��Ϊһ������ArryList
		this.list=new ArrayList<T>();
		
	}
	//��������˷��ͣ�������Ҫ��дlist��add������getList�ķ���
	public void add(T t){
		this.list.add(t);
	}
	 public List<T> getList(){
	        return this.list;
	    }
	
}	
