package com.wangxin.test20z;

import java.io.File;

public class TestDemo1_1 {
	public static void main(String[] args) {
		File file = new File("test");
		//�ж��ļ��Ƿ���ڣ�����true ������false
		if (!file.exists()) {
			System.out.println("�ļ��Ѵ�����");
			file = new File("src","test.txt");
		}
		System.out.println("���ƣ�"+file.getName());
		System.out.println("���·����"+file.getPath());
		System.out.println("����·����"+file.getAbsoluteFile());
		System.out.println("�ļ���С��"+file.length()+"�ֽ�");
		file.delete();
		if (!file.exists()) {
			System.out.println("�ļ���ɾ��");
		}else {
			System.out.println("�ļ�ɾ��ʧ��");
		}
	}
}
