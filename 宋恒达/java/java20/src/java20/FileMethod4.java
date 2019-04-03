package java20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����FileInputStream��FileOutputStream,��������Ҫ��
 * 1.��FileInputStream�ڵ�ǰĿ¼�´���һ���ļ�"test.txt", �����ļ����"Hello
 * World",����ļ����ڣ�����ԭ�ļ����ݺ���׷�� 2.��FileInputStream����text.txt�ļ������ڿ���̨�ϴ�ӡ��test.txt
 * �е����� 3.Ҫ����try-catch-finally�����쳣�����ҹر���Ӧ����finally����
 * 4.�ӿ���̨����һ���ļ���������������·�����磺D:\\test.txt�����ж�
 * ���ļ��Ƿ���ڣ�����ԭ�ļ���ͬ·���´���һ���ļ���Ϊ��copyԭ�ļ����������ļ��� ������ļ������ڣ��򴴽����ļ�
 * 
 * @author mo
 *
 */
public class FileMethod4 {
	public static void main(String[] args) {
		/**
		 * 1.��FileInputStream�ڵ�ǰĿ¼�´���һ���ļ�"test.txt", �����ļ����"Hello
		 * World",����ļ����ڣ�����ԭ�ļ����ݺ���׷��
		 */
		File file = new File("test.txt");
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		try {
			fo = new FileOutputStream(file, true);
			bo = new BufferedOutputStream(fo);
			String str = "Hello world\n";
			byte[] bytes = str.getBytes();
			bo.write(bytes);
			bo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 2.��FileInputStream����text.txt�ļ������ڿ���̨�ϴ�ӡ��test.txt �е�����
		 */
		FileInputStream fi=null;
		BufferedInputStream bi=null;
		String info="";
		try {
			fi=new FileInputStream(file);
			bi=new BufferedInputStream(fi);
			byte[] bytes1=new byte[1024];
			int length=-1;
			while((length=bi.read(bytes1))!=-1) {
				info=info.concat(new String(bytes1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				bi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�ı�����ϢΪ��"+info);
		File f1=new File("D:\\test.txt");
		if(!f1.exists()) {
			try {
				file.createNewFile();
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File f2=new File("D:\\copy_"+file.getName());
		if(!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
