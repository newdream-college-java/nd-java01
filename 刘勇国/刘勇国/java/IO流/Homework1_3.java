package 第21章IO流作业;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Homework1_3 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in =new BufferedInputStream(new FileInputStream("D:1.jpg"));
		BufferedOutputStream out =new BufferedOutputStream(new FileOutputStream("D:2.jpg"));
		int num;
		while((num=in.read())!=-1){
			out.write(num);
		}
		out.flush();
		out.close();
		in.close();
	
	}
}
