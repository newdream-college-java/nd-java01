package 作业;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:/xuexi/图片/Penguins.jpg");
		BufferedInputStream bis = new BufferedInputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/2019-01/myPicture.jpg"));
		byte[] buf = new byte[1024];
		int num  = bis.read(buf);
		while(num!=-1) {
            //写入bbb.jpg 文件   一桶（根据实际字节数量）
            bos.write(buf,0,num);
            //继续读
            num = bis.read(buf);
        }
        //4.关流
        bos.close();
        bis.close();
        file.close();
        System.out.println("图片复制成功");
	}

}
