package chapter20;

import java.io.File;
import java.io.IOException;

public class Hw01 {

	public static void main(String[] args) {
		System.out.println("�ļ��Ѵ�����");
		File doc=new File("D:/test.txt");
		try {
			doc.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ƣ�"+doc.getName());
		System.out.println("���·����"+doc.getPath());
		System.out.println("����·����"+doc.getAbsolutePath());
		System.out.println("�ļ���С��"+doc.length()+"�ֽ�");
		doc.delete();
		System.out.println("�ļ���ɾ����");
	}

}
