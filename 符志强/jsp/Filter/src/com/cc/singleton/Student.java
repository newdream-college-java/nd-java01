package com.cc.singleton;

public class Student {
	// ����̰߳�ȫ����
	/*
	 * public static Student stu;//���ظ������ߵ�Ψһ���󣿣��� private
	 * Student(){//���췽��(�ѹ��췽�����˽�еľ�ֻ�ܵ���һ��)
	 * 
	 * } //�ѷ������˽�е� public static Student getStu(){//�ѷ�����ɾ�̬�ķ��� if(stu==null){
	 * stu=new Student(); } return stu; }
	 */

	// ����̰߳�ȫ����--����
	private static int count = 0;
	private static Student stu;// ���ظ������ߵ�Ψһ���󣿣���

	private Student() {
	}

	public static Student getStu() {
		System.out.println(1);
			if (count<3) {
			synchronized (stu) {
				count++;
				stu=new Student();
				return stu;
				//count++;
			
			//count++;
			}
			}
			
		return null;
		//count++;
		
	}

	
}
