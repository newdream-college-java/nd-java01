package 第20章集合作业_1_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
		LinkedList<Object> arr=new LinkedList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		//验证先进先出，旺财0是先进去的
		//如果都在0位置插入的数据元素，ArrayList数据结构会自动把先插入的往后推一个位置
		//其实这就是头插法的原理addFirst方法
	
		
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		System.out.println("=================");
		arr.removeFirst();
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	} 
}
