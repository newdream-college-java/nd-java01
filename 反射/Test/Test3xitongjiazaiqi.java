package com.cc.Test;

public class Test3xitongjiazaiqi {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//��ȡϵͳ������������ʾ���һ���ࣩ
		System.out.println("��ȡϵͳ������������ʾ���һ���ࣩ");
		ClassLoader cld = ClassLoader.getSystemClassLoader();
		//Ȼ��ͬ���ϵͳ���������ȡloadClass  ���·���Ž�ȥ 
		//sun.misc.Launcher$AppClassLoader@1372a1a  cld1���������
		Class<?> cld1 = cld.loadClass("com.cc.Student.Student");
		//�����cld1��ʱ�� �����getname�����ͻ���һ��class  ���ֱ�����cld1�Ͷ�һ��class
		System.out.println(cld+"----"+cld1.getName());
		
		
		
		System.out.println("��ȡ��չ����������ְҵ��һ���ࣩ");
		//��ȡ��չ����������ְҵ��һ���ࣩ
		ClassLoader parent = cld.getParent();
		System.out.println(parent);
		
		
		//��ȡ��������������ţ�
		//null---���������ײ�����c,c++���������ģ�û�п�Դ
		System.out.println("//��ȡ��������������ţ�");
		ClassLoader parent2 = parent.getParent();
		System.out.println(parent2);
	}

}
