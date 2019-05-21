package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @author mo
* @version 2019年5月20日 下午8:42:42
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
			System.out.println("客服说"+content);
		}
		os.write("我昨天充的花费".getBytes());
		in.close();
		os.close();
	}
}
