package chapter20;

import java.io.File;
import java.io.IOException;

public class Hw01 {

	public static void main(String[] args) {
		System.out.println("文件已创建！");
		File doc=new File("D:/test.txt");
		try {
			doc.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("名称："+doc.getName());
		System.out.println("相对路径："+doc.getPath());
		System.out.println("绝对路径："+doc.getAbsolutePath());
		System.out.println("文件大小："+doc.length()+"字节");
		doc.delete();
		System.out.println("文件已删除！");
	}

}
