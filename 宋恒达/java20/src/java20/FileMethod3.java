package java20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 图片Penguins.jpg位于D盘根目录下，要求将此图片复制到
 * C:\\myFile\\myPicture.jpg,使用FileInputStream和FileOutputStream
 * 实现教员提供的"练习素材"中图片完成此题
 * @author mo
 *
 */
public class FileMethod3 {
	public static void main(String[] args) {
		File file=new File("D:\\Penguins.jpg");
		if(!file.exists()) {
			System.out.println("被复制的文件不存在！！！");
			return;
		}
		FileInputStream fi=null;
		BufferedInputStream bi=null;
		FileOutputStream fo=null;
		BufferedOutputStream bo=null;
		File file1=new File("C:\\myFile\\Penguins.jpg");
		if(!file1.getParentFile().exists()) {
			file1.getParentFile().mkdir();
		}
		try {
			fi=new FileInputStream(file);
			bi=new BufferedInputStream(fi);
			fo=new FileOutputStream(file1);
			bo=new BufferedOutputStream(fo);
			byte[] bytes=new byte[1024];
			int length=-1;
			while((length=bi.read(bytes))!=-1) {
				bo.write(bytes);
			}
			bo.close();
			fo.close();
			bi.close();
			fi.close();
			System.out.println("复制成功！！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
