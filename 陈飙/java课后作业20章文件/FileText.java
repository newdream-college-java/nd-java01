package java�κ���ҵ20���ļ�;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {
	public static void main(String[] args) {
		File file = new File("Text.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("�ļ��Դ�����");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write("�ҵ��ഺ������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ƣ�" + file.getName());
		System.out.println("���·����" + file.getPath());
		System.out.println("����·����" + file.getAbsolutePath());
		System.out.println("�ļ���С��" + file.length() / 1024.0 + "kb");
		/*
		 * if(file.delete()){ System.out.println("�ļ���ɾ����"); }
		 */

	}
}
