package com.java.java23;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test05 {
	public static void main(String[] args) {
		FileOutputStream file=null;
		OutputStreamWriter ow = null;
		FileInputStream fi= null;
		InputStreamReader fs=null;
		BufferedReader bf=null;
		try {
			file = new FileOutputStream("D:/test.txt",true);
			ow=new OutputStreamWriter(file);
			ow.write("Hello  World");
			fi=new FileInputStream("D:/test.txt");
			fs=new InputStreamReader(fi);
			bf=new BufferedReader(fs);
			String con=bf.readLine();
			while(con!=null){
			    System.out.println(con);
				con=bf.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ow.close();
				fs.close();
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
	}
}
