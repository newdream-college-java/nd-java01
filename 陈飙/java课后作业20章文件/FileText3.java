package java课后作业20章文件;

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
			System.out.println("创建成功");
		}
		// 复制图片首先你的读入为A文件的图片（FileInputStream的流）
		FileInputStream fis = new FileInputStream("FF201311.jpg");
		// 再在b的文件里面写出它的图片（FileOutputStream流）
		FileOutputStream fop = new FileOutputStream("B/f.jpg");

		// 然后缓冲他们
		BufferedInputStream bit = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fop);

		// 首先设置一个桶
		byte[] buf = new byte[1024];
		// 实际读到的数据
		int num = bit.read(buf);
		//
		if (num != -1) {
			// 把读到的写入到b文件里面
			bos.write(buf, 0, num);
			// 继续读
			num = bit.read(buf);

		}
		// 关流
		bos.close();
		bit.close();
		fop.close();
		fis.close();
		System.out.println("图片复制成功！");
	}
}
