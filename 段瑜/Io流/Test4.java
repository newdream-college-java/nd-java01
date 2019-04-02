package ื๗าต;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Test4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream bos=null;
		OutputStreamWriter ow=null;
		FileInputStream fi=null;
		InputStreamReader fs=null;
		BufferedReader bf=null;
		try{
			bos =  new FileOutputStream("test.txt",true);
			ow=new OutputStreamWriter(bos);
			ow.write("Hello World");
			fi=new FileInputStream("test.txt");
			fs=new InputStreamReader(fi);
			bf=new BufferedReader(fs);
			String con=bf.readLine();
			while(con!=null){
				System.out.println(con);
				con=bf.readLine();
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				ow.close();
				fs.close();
				bf.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
