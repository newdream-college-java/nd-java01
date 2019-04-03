package java20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用FileInputStream和FileOutputStream,完成下面的要求：
 * 1.用FileInputStream在当前目录下创建一个文件"test.txt", 并向文件输出"Hello
 * World",如果文件存在，则在原文件内容后面追加 2.用FileInputStream读入text.txt文件，并在控制台上打印出test.txt
 * 中的内容 3.要求用try-catch-finally处理异常，并且关闭流应放在finally块中
 * 4.从控制台输入一个文件名，（包含完整路径，如：D:\\test.txt），判断
 * 该文件是否存在，则在原文件相同路径下创建一个文件名为“copy原文件名”的新文件， 如果该文件不存在，则创建该文件
 * 
 * @author mo
 *
 */
public class FileMethod4 {
	public static void main(String[] args) {
		/**
		 * 1.用FileInputStream在当前目录下创建一个文件"test.txt", 并向文件输出"Hello
		 * World",如果文件存在，则在原文件内容后面追加
		 */
		File file = new File("test.txt");
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		try {
			fo = new FileOutputStream(file, true);
			bo = new BufferedOutputStream(fo);
			String str = "Hello world\n";
			byte[] bytes = str.getBytes();
			bo.write(bytes);
			bo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 2.用FileInputStream读入text.txt文件，并在控制台上打印出test.txt 中的内容
		 */
		FileInputStream fi=null;
		BufferedInputStream bi=null;
		String info="";
		try {
			fi=new FileInputStream(file);
			bi=new BufferedInputStream(fi);
			byte[] bytes1=new byte[1024];
			int length=-1;
			while((length=bi.read(bytes1))!=-1) {
				info=info.concat(new String(bytes1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				bi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("文本中信息为："+info);
		File f1=new File("D:\\test.txt");
		if(!f1.exists()) {
			try {
				file.createNewFile();
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File f2=new File("D:\\copy_"+file.getName());
		if(!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
