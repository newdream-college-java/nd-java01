package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @author mo
* @version 2019��5��20�� ����8:42:42
* @description
*/
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("127.0.0.1", 10086);
		OutputStream os=client.getOutputStream();
		InputStream in=client.getInputStream();
		byte[] bytes=new byte[1024];
		int num=in.read(bytes);
		if(num!=-1) {
			String content=new String(bytes);
			System.out.println("�ͷ�˵"+content);
		}
		os.write("�������Ļ���".getBytes());
		in.close();
		os.close();
	}
}
