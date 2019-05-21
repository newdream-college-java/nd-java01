package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class kefu {
	public static void main(String[] args) throws Exception {
		// 输入函数
		Scanner input = new Scanner(System.in);
		// 1. 创建一个ServerSocket对象(装了一台热线电话 ：公布号码 10086)
		ServerSocket server = new ServerSocket(10086);
		System.out.println("服务端以启动");
		// 2. Socket对象，监听ServerSocket对象。（请了很多客户妹妹，监听电话）
		// 监听服务端口 ，如果有客户端连接那么就会返回一个socket对象
		Socket socket = server.accept();
		System.out.println("有客户端接入。。。");
		// 3. io流（交流沟通）
		// 3.1说的流------OutputStream
		OutputStream os = socket.getOutputStream();
		// 转换流 OutputStreamWrite
		// new OutputStreamWriter(os)字节流转字符流 字符流转换成换成流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		// 3.2听的流----InputStream
		InputStream in = socket.getInputStream();
		// 转换流 InputStreamReader
		// new InputStreamReader(in)字节流转字符流 字符流转换成换成流
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		while (true) {
			// 给用户数据
			System.out.println("客服说：");
			String s = input.next();
			bw.write(s + "\n");
			// 刷新缓存
			bw.flush();
			// 获取用户数据
			String c = br.readLine();
			System.out.println("听用户说：" + c);
			// 判断是否要挂电话
			if (s.equals("88") && c.equals("88")) {
				System.out.println("挂电话了");
				break;
			}
		}

		// 关流
		br.close();
		in.close();
		bw.close();
		os.close();
	}
}
