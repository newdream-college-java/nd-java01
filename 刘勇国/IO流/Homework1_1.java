package ��21��IO����ҵ;

import java.io.File;
import java.io.IOException;

public class Homework1_1 {
	public static void main(String[] args) {
			File file =new File("D:/text.txt");
			if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ�����");
				System.out.println("���ƣ�"+file.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				System.out.println("���·����"+file.getPath());
				System.out.println("����·����"+file.getAbsolutePath());
				System.out.println("�ļ���С��"+file.length()+"�ֽ�");
				if(file.delete()){
					System.out.println("�ļ���ɾ����");
				}
			}	
		}
	}
}
