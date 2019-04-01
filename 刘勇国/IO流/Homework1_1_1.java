package 第21章IO流作业;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework1_1_1 {
	public static void main(String[] args) {
		File file1=new File("D:我的青春谁做主.txt");
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw =new FileWriter(file1,true);
			fw.write("我的青春我做主\r\n");
			fw.write("我的青春我做主\r\n");
			fw.write("我的青春我做主\r\n");
			fw.write("我的青春我做主\r\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2 =new File("c:/myFile");
		if(!file2.exists()){
			file2.mkdir();
			System.out.println("创建myFile文件夹成功");
		}
		File file3=new File("c:/myFile/myPrime.txt");
		if(!file3.exists()){
			try {
				//创建被复制文件成功
				file3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//读入d盘源文件
		try {
			//开读入流
			FileReader fr =new FileReader(file1);
			//单字节读入
			int num=fr.read();
			//开写出流
			FileWriter fw=new FileWriter(file3);
			while(num!=-1){
				fw.write((char)num);
				num=fr.read();
			}
			fw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
