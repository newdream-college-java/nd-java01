package ��ҵ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("text.txt");
		System.out.println("�ļ��Ѵ�����");
		System.out.println("���ƣ�"+file);
		System.out.print("���·����");
		System.out.println(file.getPath());
		System.out.print("����·����");
		System.out.println(file.getAbsolutePath());
		System.out.print("�ļ���С��");
		System.out.println(file.length()+"�ֽ�");
		System.out.println(file.delete());
		System.out.println("�ļ���ɾ��");
		FileInputStream b=new FileInputStream("C:/Users/Administrator/Desktop/�ʼ�/fil.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/Users/Administrator/Desktop/�ʼ�/fil1.txt"));
		BufferedInputStream bis = new BufferedInputStream(b);
		byte[] buf = new byte[1024];
		 int a = bis.read(buf);
		while(a!=-1){
			bos.write(buf,0,a);
			a = bis.read(buf);
		}
		bis.close();
		bos.close();
        b.close();
	}
}
