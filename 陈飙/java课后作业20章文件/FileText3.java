package java�κ���ҵ20���ļ�;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileText3 {
	public static void main(String[] args) throws IOException {
		File file = new File("B");

		if (!file.exists()) {
			file.mkdir();
			System.out.println("�����ɹ�");
		}
		// ����ͼƬ������Ķ���ΪA�ļ���ͼƬ��FileInputStream������
		FileInputStream fis = new FileInputStream("FF201311.jpg");
		// ����b���ļ�����д������ͼƬ��FileOutputStream����
		FileOutputStream fop = new FileOutputStream("B/f.jpg");

		// Ȼ�󻺳�����
		BufferedInputStream bit = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fop);

		// ��������һ��Ͱ
		byte[] buf = new byte[1024];
		// ʵ�ʶ���������
		int num = bit.read(buf);
		//
		if (num != -1) {
			// �Ѷ�����д�뵽b�ļ�����
			bos.write(buf, 0, num);
			// ������
			num = bit.read(buf);

		}
		// ����
		bos.close();
		bit.close();
		fop.close();
		fis.close();
		System.out.println("ͼƬ���Ƴɹ���");
	}
}
