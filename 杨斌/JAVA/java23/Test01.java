package com.java.java23;
import java.io.File;
import java.io.IOException;
/**
 *  File类演示代码
 */
public class Test01 {
	/**
	 * 创建文件的方法
	 * @param file 文件对象
	 */
	
	public void create(File file){
		//判断文件是否存在,不存在则创建，并提示创建信息
		
		if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 删除文件
	 * @param file 文件对象
	 */
	public void delete(File file){
		//判断文件是否存在,存在则删除，提示删除信息
		//如果文件不存在：显示"文件路径或文件名错误，没有找到该文件信息!"
		if(file.exists()){
				file.delete();
				System.out.println("删除成功");
		}else{
			System.out.println("文件路径或文件名错误，没有找到该文件信息!");
		}
	}

	/**
	 * 显示文件信息
	 * @param file 文件对象
	 */
	public void showFileInfo(File file){
		//判断文件是否存在
		//如果是文件:显示名称、相对|绝对路径、文件字节大小
		//如果是目录：显示"这是一个目录!"
		//如果文件不存在：显示"文件路径或文件名错误，没有找到该文件信息!"
		if(file.exists()){
			if(file.isDirectory()){
				System.out.println("这个一个目录");		
			}else{
				System.out.println("文件名："+file.getName());
				System.out.println("相对路径："+file.getPath());
				System.out.println("绝对路径："+file.getAbsolutePath());
				System.out.println("文件大小："+file.length()+"字节");
			}
		}else{
			System.out.println("文件路径或文件名错误，没有找到该文件信息!");
		}
	}

	/**
	 * 入口
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("test.txt");
		Test01 fm=new Test01();
		fm.create(file);
		fm.showFileInfo(file);
		fm.delete(file);
	}

}
