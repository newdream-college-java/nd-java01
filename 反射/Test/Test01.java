package com.cc.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.cc.Student.Student;

public class Test01 {
/**
 * 
 * 
 * ��������
 * ���䣺��̬���룬 .java�ļ���������.class�ļ���Class��Ķ�������.class�ļ�����Ϣ
 *    һ��.class�ļ�--------һ��Class�����
 *    .class�ļ���������Ϣ��ȫ�޶����������ԣ����������췽��....
 *    ����1���õ�Class��������ַ�ʽ��
 *         1) Class.forName()      2)����.class    3)����.getClass()  4)URL�������   ���  ���¹�  ����  20��
 *    ����2��������������ã���������ķ��ࣿ���������������ƣ�
 *      1����class�ļ����ص��ڴ���
 *      2��ϵͳ����������չ����������������
 *      3��ί�л��ƣ�һ���Ի��ƣ�͸������
 *    ����3�����������������ڣ�����������������servlet�����������ܽ᣿
 *      1����ʼ��������������
 *             ���٣�   ��Ŀ�Ƴ����������رգ����²���
 *             
 *      2������������ʱ�򣺼�����(����˳��)---->������
 *             ��1�ν��������ʱ��servlet�Ĺ���---->servlet��ʼ��--->������-->servlet����
 *             �������رգ�servlet����--->����������--->������
 * @param args
 * @throws IllegalAccessException 
 * @throws InstantiationException 
 */
	public static void main(String[] args) throws Exception {
	//���Ȼ�ȡ����
	Class st=Student.class;//��������λ��
	Object stu = st.newInstance();//���Ƕ���
	//Ȼ��Ҫ��ȡ��������
	Field field = st.getField("birthday");
	//��ȡ��������birthday֮�� ��������ֵ
	field.set(stu, "1998-07-30");
	System.out.println(field.get(stu));
	
	System.out.println("�����ǻ�ȡ�������ԵĲ���");
	
	//2.��ȡ�ǹ������� ����.class�ļ��Ķ���ȥ����getDeclaredField
	Field agefield = st.getDeclaredField("age");
	Field namefield = st.getDeclaredField("name");
	//��Ϊ����˽�е�����Ҫ�����ƽ�    �������Ҫ���ƽ�ſ�����ֵ
	agefield.setAccessible(true);
	namefield.setAccessible(true);
	//����ֵ
	agefield.set(stu, 22);
	namefield.set(stu, "���");
	
	
	System.out.println(agefield.getInt(stu));
	System.out.println(namefield.get(stu));
	
	System.out.println("�����ǻ�ȡ˽�����Բ�����ֵ Ȼ���ȡ��ֵ");
	
	
	//3.��ȡ���й�������
	Field[] fields = st.getFields();
	//1---Modifier�� ���� 
	for(int i=0;i<fields.length;i++){
		System.out.println(fields[i].getModifiers()+"  -----  "+fields[i].getType()+" "+fields[i].getName());
		
	}
	System.out.println("�����ǻ�ȡ���й�������");
	
	
	
	//4.��ȡ��������
	Field[] fiels = st.getDeclaredFields();
	//��Ҫ�����ƽ� ��Ϊ��Щ������˽�е�
	Field.setAccessible(fiels,true);
		for(int i=0;i<fiels.length;i++){
			System.out.println(fiels[i].getName()+"---"+fiels[i].getType()+"----"+modifyToString(fiels[i].getModifiers()));
		}
	}
	//���������д��main��������� Ҫ��static����
	 public static String modifyToString(int modify) {
		 if(modify==Modifier.PUBLIC){
		  return "PUBLIC";
		 }else if(modify==Modifier.PRIVATE){
			 return "PRIVATE";
		 }else if(modify==Modifier.STATIC){
			 return "STATIC";
		 }
		return "Ĭ�����η�";
	 }
}










