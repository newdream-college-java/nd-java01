package java课后作业20章文件;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileText5 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		String s = input.next();

		File file = new File("D:\\java\\java课后作业\\我的青春谁做主.txt");
		//System.out.println(file.getAbsolutePath());
		if (s.equals(file.getCanonicalPath())) {

			File file1 = new File("copy_原文件.txt");
			if (!file1.exists()) {
				file1.createNewFile();
			}
			System.out.println("创建原文件成功!");
		} else {
			file.createNewFile();
			System.out.println("创建成功！");
		}
	}
}
