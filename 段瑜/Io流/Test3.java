package ��ҵ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:/xuexi/ͼƬ/Penguins.jpg");
		BufferedInputStream bis = new BufferedInputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/2019-01/myPicture.jpg"));
		byte[] buf = new byte[1024];
		int num  = bis.read(buf);
		while(num!=-1) {
            //д��bbb.jpg �ļ�   һͰ������ʵ���ֽ�������
            bos.write(buf,0,num);
            //������
            num = bis.read(buf);
        }
        //4.����
        bos.close();
        bis.close();
        file.close();
        System.out.println("ͼƬ���Ƴɹ�");
	}

}
