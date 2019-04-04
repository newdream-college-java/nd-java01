package com.java.java23;

import java.io.File;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {
		File file=new File("d:/test.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			File file2=new File("d:\\copy_原文件名.txt");
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
