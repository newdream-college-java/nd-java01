package java20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 根据字节流复制文件，文件“我的青春我做主.txt”位于D盘根目录下
 * 要求将此文件的内容复制到C:\myFile\myPrime.txt中
 * 根据教员提供的“练习素材”的“我的青春我做主.txt”完成任务
 * @author mo
 *
 */
public class FileMethod1 {
	public static void main(String[] args) {
		//创建被copy的文件对象
		File copyFile=new File("D:\\我的青春我做主.txt");
		//判断被copy的文件存不存在
		if(!copyFile.exists()) {
			try {
				//不存在就创建文件
				copyFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//创建文件输入流
		FileWriter fwCopy=null;
		//创建缓存输入流
		BufferedWriter bwCopy=null;
		try {
			fwCopy = new FileWriter(copyFile);
			bwCopy=new BufferedWriter(fwCopy);
			//写入文件
			bwCopy.write("我的青春我我做主！！！");
			bwCopy.close();
			fwCopy.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File("C:\\myFile\\myPrime.txt");
		if(!file.exists()) {
			if(file.getParentFile()!=null) {
				file.getParentFile().mkdir();
			}
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fr=new FileReader(copyFile);
			br=new BufferedReader(fr);
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			String content=null;
			while((content=br.readLine())!=null) {
				bw.write(content);
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("复制完成，请查看文件！！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
