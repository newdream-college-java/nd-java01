package java课后作业20章文件;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {
	public static void main(String[] args) {
		File file = new File("Text.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("文件以创建！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
		System.out.println("名称：" + file.getName());
		System.out.println("相对路径：" + file.getPath());
		System.out.println("绝对路径：" + file.getAbsolutePath());
		System.out.println("文件大小：" + file.length() / 1024.0 + "kb");
		/*
		 * if(file.delete()){ System.out.println("文件已删除！"); }
		 */

	}
}
