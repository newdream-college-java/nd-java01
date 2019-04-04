package com.java.java23;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test03 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:/Penguins.jpg");
		FileOutputStream file2=new FileOutputStream("C:/myFile/Picture.jpg");
		byte[] by=new byte[1024];
		int num=file.read(by);
		while(num!=-1){
			file2.write(by,0,num);
			num=file.read(by);
		}
	}
}
