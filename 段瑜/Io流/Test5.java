package ื๗าต;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("D:/test.txt");
		if(!file.equals(true)){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			File fi=new File("D\\copy_.txt");
			try{
				fi.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
