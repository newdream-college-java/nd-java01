package com.java.java23;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:/我的青春谁做主.txt");
		File fl=new File("C:"+File.separator+"myFile","myPrime.txt");
		if(!fl.exists()){
			fl.getParentFile().mkdirs();
			fl.createNewFile();
		}
		BufferedOutputStream file2=new BufferedOutputStream(new FileOutputStream(fl));
		byte[] cr=new byte[1024];
		int num=file.read(cr);	
		while(num!=-1){
			try {
				file2.write(cr,0,num);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				num=file.read(cr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println("");
		file.close();
		file2.close();
		
		
	}
}

