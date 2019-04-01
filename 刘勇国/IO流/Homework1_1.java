package 第21章IO流作业;

import java.io.File;
import java.io.IOException;

public class Homework1_1 {
	public static void main(String[] args) {
			File file =new File("D:/text.txt");
			if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("文件已创建！");
				System.out.println("名称："+file.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				System.out.println("相对路径："+file.getPath());
				System.out.println("绝对路径："+file.getAbsolutePath());
				System.out.println("文件大小："+file.length()+"字节");
				if(file.delete()){
					System.out.println("文件已删除！");
				}
			}	
		}
	}
}
