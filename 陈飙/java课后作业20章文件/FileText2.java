package java�κ���ҵ20���ļ�;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileText2 {
	public static void main(String[] args) {
		// �����ı�
		File file = new File("�ҵ��ഺ˭����.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Ϊ�ı�����дһ�仰
		// ������д����FileWriter
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
		// �����ļ���
		File file1 = new File("A");

		if (!file1.exists()) {
			file1.mkdir();
			System.out.println("�����ļ��гɹ���");
		}
		// ����Ҫ��ȡtxt��a�ļ�������
		// Ҫ��a�ļ����洴��һ��txt�ı�
		// BufferedReader
		File file2 = new File("D:\\java\\java�κ���ҵ\\A\\�ҵ��ഺ˭����.txt");

		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// ��ȡ���ҵ��ഺ˭����.txt��
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Ϊfile2�ļ�д��
		FileWriter fw1 = null;
		try {
			fw1 = new FileWriter(file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����ȥ��ȡ
		BufferedReader bra = new BufferedReader(fr);
		// һ�ζ�ȡһ��
		String con = null;
		try {
			con = bra.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (con != null) {
			try {
				fw1.write(con);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con = bra.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//����ԭ����ȹ�
		try {
			bra.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			fw1.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���Ƴɹ�");
		
	}
}
