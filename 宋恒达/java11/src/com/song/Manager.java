package com.song;

/**
 * ��д����ԱManager��ʹ��show()�������� ����Ա��Ϣ��ʹ��return���ʵ����Ϣ�ķ��أ�
 * 
 * @author mo
 *
 */
public class Manager {
	String name;
	String password;

	public String show() {
		return "����Ա��Ϣ�û���Ϊ:" + name + "\t����Ϊ:" + password;
	}
}
