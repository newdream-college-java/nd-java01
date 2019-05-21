package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
* @author mo
* @version 2019年5月20日 下午8:37:01
* @description
*/
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(10086);
		System.out.println("服务器已经启动...");
		Socket socket=server.accept();
		System.out.println("有客户端接入了...");
		OutputStream os=socket. getOutputStream();
		InputStream in=socket.getInputStream();
		os.write("您好，我是工号9527，很高兴为你服务。".getBytes());
		byte[] bytes=new byte[1024];
		int num=in.read(bytes);
		if(num!=-1) {
			String content=new String(bytes);
			System.out.println("客户说："+content);
		}
		in.close();
		os.close();
	}
}
