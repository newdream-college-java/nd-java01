package java�κ���ҵ20���ļ�;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileText4 {
	/*
	 * public String toString(){ return bis;
	 * 
	 * }
	 */
	public static void main(String[] args) throws IOException {
		// �����ı�
		File file = new File("text3.txt");
		if (!file.exists()) {
			FileOutputStream fos = new FileOutputStream(file);
			fos.close();
		}
		FileWriter fw = new FileWriter(file, true);

		fw.write("Hello word");
		System.out.println("д��ɹ���");

		// fw.write("Hello word");
		// String a = "Hello word";
		// FileWriter fw = new FileWriter(file, true);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int br = bis.read();
		while (br != -1) {
			System.out.print((char) br);
			br = bis.read();
		}
		bis.close();
		fis.close();
		fw.close();
		// fos.close();
	}
}
