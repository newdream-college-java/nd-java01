package java20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ͼƬPenguins.jpgλ��D�̸�Ŀ¼�£�Ҫ�󽫴�ͼƬ���Ƶ�
 * C:\\myFile\\myPicture.jpg,ʹ��FileInputStream��FileOutputStream
 * ʵ�ֽ�Ա�ṩ��"��ϰ�ز�"��ͼƬ��ɴ���
 * @author mo
 *
 */
public class FileMethod3 {
	public static void main(String[] args) {
		File file=new File("D:\\Penguins.jpg");
		if(!file.exists()) {
			System.out.println("�����Ƶ��ļ������ڣ�����");
			return;
		}
		FileInputStream fi=null;
		BufferedInputStream bi=null;
		FileOutputStream fo=null;
		BufferedOutputStream bo=null;
		File file1=new File("C:\\myFile\\Penguins.jpg");
		if(!file1.getParentFile().exists()) {
			file1.getParentFile().mkdir();
		}
		try {
			fi=new FileInputStream(file);
			bi=new BufferedInputStream(fi);
			fo=new FileOutputStream(file1);
			bo=new BufferedOutputStream(fo);
			byte[] bytes=new byte[1024];
			int length=-1;
			while((length=bi.read(bytes))!=-1) {
				bo.write(bytes);
			}
			bo.close();
			fo.close();
			bi.close();
			fi.close();
			System.out.println("���Ƴɹ�����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
