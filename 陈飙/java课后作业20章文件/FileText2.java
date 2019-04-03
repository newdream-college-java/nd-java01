package java课后作业20章文件;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileText2 {
	public static void main(String[] args) {
		// 创建文本
		File file = new File("我的青春谁做主.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 为文本里面写一句话
		// 即创建写的流FileWriter
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write("我的青春我做主");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建文件夹
		File file1 = new File("A");

		if (!file1.exists()) {
			file1.mkdir();
			System.out.println("创建文件夹成功！");
		}
		// 现在要读取txt到a文件夹里面
		// 要在a文件里面创建一个txt文本
		// BufferedReader
		File file2 = new File("D:\\java\\java课后作业\\A\\我的青春谁做主.txt");

		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 读取《我的青春谁做主.txt》
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 为file2文件写入
		FileWriter fw1 = null;
		try {
			fw1 = new FileWriter(file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 缓冲去读取
		BufferedReader bra = new BufferedReader(fr);
		// 一次读取一行
		String con = null;
		try {
			con = bra.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (con != null) {
			try {
				fw1.write(con);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con = bra.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//关流原则后开先关
		try {
			bra.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			fw1.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("复制成功");
		
	}
}
