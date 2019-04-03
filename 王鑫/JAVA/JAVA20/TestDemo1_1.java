package com.wangxin.test20z;

import java.io.File;

public class TestDemo1_1 {
	public static void main(String[] args) {
		File file = new File("test");
		//判断文件是否存在，存在true ，否则false
		if (!file.exists()) {
			System.out.println("文件已创建！");
			file = new File("src","test.txt");
		}
		System.out.println("名称："+file.getName());
		System.out.println("相对路径："+file.getPath());
		System.out.println("绝对路径："+file.getAbsoluteFile());
		System.out.println("文件大小："+file.length()+"字节");
		file.delete();
		if (!file.exists()) {
			System.out.println("文件已删除");
		}else {
			System.out.println("文件删除失败");
		}
	}
}
