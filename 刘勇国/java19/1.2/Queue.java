package ��20�¼�����ҵ_1_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
		LinkedList<Object> arr=new LinkedList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		//��֤�Ƚ��ȳ�������0���Ƚ�ȥ��
		//�������0λ�ò��������Ԫ�أ�ArrayList���ݽṹ���Զ����Ȳ����������һ��λ��
		//��ʵ�����ͷ�巨��ԭ��addFirst����
	
		
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
