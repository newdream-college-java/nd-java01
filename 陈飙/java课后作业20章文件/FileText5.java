package java�κ���ҵ20���ļ�;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileText5 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		String s = input.next();

		File file = new File("D:\\java\\java�κ���ҵ\\�ҵ��ഺ˭����.txt");
		//System.out.println(file.getAbsolutePath());
		if (s.equals(file.getCanonicalPath())) {

			File file1 = new File("copy_ԭ�ļ�.txt");
			if (!file1.exists()) {
				file1.createNewFile();
			}
			System.out.println("����ԭ�ļ��ɹ�!");
		} else {
			file.createNewFile();
			System.out.println("�����ɹ���");
		}
	}
}
