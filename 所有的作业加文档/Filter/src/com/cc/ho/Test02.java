package com.cc.ho;

import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		//�õ�һ��������и���
		Class clazz=ArrayList.class;
		//Class clazz=int.class;
		//Class clazz=Integer.TYPE;
		Class[] inClazz=clazz.getInterfaces();
		while(clazz!=null){
			System.out.println("����"+clazz.getName());
			clazz=clazz.getSuperclass();
			for(int i=0;i<inClazz.length;i++){
				 System.out.println("�ӿڣ�"+inClazz[i].getName());
			}
			if(clazz!=null){
				inClazz=clazz.getInterfaces();
			}
		}
		//��װ��ͻ������ͻ�ȡclass
		//Class clazz2=int.class;
		//��װ�����е�
		//Class clazz3=Integer.TYPE;
	}
}
