package 作业;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("text.txt");
		System.out.println("文件已创建！");
		System.out.println("名称："+file);
		System.out.print("相对路径：");
		System.out.println(file.getPath());
		System.out.print("绝对路径：");
		System.out.println(file.getAbsolutePath());
		System.out.print("文件大小：");
		System.out.println(file.length()+"字节");
		System.out.println(file.delete());
		System.out.println("文件已删除");
		FileInputStream b=new FileInputStream("C:/Users/Administrator/Desktop/笔记/fil.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/Users/Administrator/Desktop/笔记/fil1.txt"));
		BufferedInputStream bis = new BufferedInputStream(b);
		byte[] buf = new byte[1024];
		 int a = bis.read(buf);
		while(a!=-1){
			bos.write(buf,0,a);
			a = bis.read(buf);
		}
		bis.close();
		bos.close();
        b.close();
	}
}
