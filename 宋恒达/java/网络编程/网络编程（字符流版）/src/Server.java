import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
* @author mob
* @version 2019年5月21日 上午11:18:19
* @description
*/
public class Server {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		ServerSocket serverSocket=new ServerSocket(10086);
		System.out.println("服务器启动了");
		Socket server=serverSocket.accept();
		System.out.println("有客户端接入了");
		OutputStream os=server.getOutputStream();
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(os));
		InputStream in=server.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
//		writer.write("发送消息成功\r\n");
//		writer.flush();
//		String content=reader.readLine();
//		if(content!=null) {
//			System.out.println("客户说："+content);
//		}
		while(true) {
			System.out.print("客服输入：");
			String msg=input.next();
			writer.write(msg+"\n");
			writer.flush();
			String content=reader.readLine();
			if(content!=null) {
				System.out.println("客户说："+content);
			}
			if(msg.equals("88")&&content.equals("88")) {
				System.out.println("挂电话了");
				break;
			}
		}
		reader.close();
		in.close();
		writer.close();
		os.close();
		server.close();
		serverSocket.close();
	}
}
