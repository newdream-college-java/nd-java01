package java20;

import java.io.File;
import java.io.IOException;
/**
 * 根据教员提供的“练习——素材”的FileMethod.java文件
 * 拷贝至项目，完成文件注释部分的代码编写
 * @author mo
 *
 */
public class FileMethod {
	public static void main(String[] args) {
		//创建文件对象
		File file=new File("D:\\text.java");
		if(!file.exists()) {	//判断文件是否存在
			try {
				//创建文件
				file.createNewFile();
				System.out.println("文件已创建！");
				//得到文件名
				System.out.println("名称："+file.getName());
				//得到文件相对路径
				System.out.println("相对路径："+file.getPath());
				//得到文件绝对路径
				System.out.println("绝对路径："+file.getAbsolutePath());
				//得到文件大小
				System.out.println("文件大小："+file.length()+"字节");
				if(file.delete()) {	//删除文件
					System.out.println("文件已删除！");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
