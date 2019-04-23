package chapter20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Hw0102 {
	
	public static void main(String[] args) {
		File f=new File("C:/myFile/myPrime.txt");
		copyFile();
	}


	private static  void copyFile()  {
		//声明字节输入流
        InputStream in=null;
        //声明字节输出流
        OutputStream out = null;
        //创建字节输入输出流对象
        try {
			in=new FileInputStream("D:/我的青春谁做主.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			out=new FileOutputStream("C:/myFile/myPrime.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        byte[] bit=new byte[1024];
        int count=-1;
        try {
			while((count=in.read(bit))!=-1) {
				out.write(bit,0,count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("复制完成，请查看文件。");
	}

}
