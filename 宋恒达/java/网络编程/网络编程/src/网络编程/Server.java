package ������;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author mo
* @version 2019��5��20�� ����8:37:01
* @description
*/
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(10086);
		System.out.println("�������Ѿ�����...");
		Socket socket=server.accept();
		System.out.println("�пͻ��˽�����...");
		OutputStream os=socket. getOutputStream();
		InputStream in=socket.getInputStream();
		os.write("���ã����ǹ���9527���ܸ���Ϊ�����".getBytes());
		byte[] bytes=new byte[1024];
		int num=in.read(bytes);
		if(num!=-1) {
			String content=new String(bytes);
			System.out.println("�ͻ�˵��"+content);
		}
		in.close();
		os.close();
	}
}
