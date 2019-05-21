package zuoye;

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

import com.cc.tcp.thread.ReaderThread;
import com.cc.tcp.thread.WriterThread;

public class kefu2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// 1. 创建一个ServerScoker对象(装了一台热线电话 ：公布号码 10086)
		ServerSocket server = new ServerSocket(10086);// 端口号：0~65535
		System.out.println("服务端已经启动........");
		// 2. Socket对象，监听ServerSocket对象。（请了很多客户妹妹，监听电话）
		Socket socket = server.accept();// 监听服务端口 ，如果有客户端连接那么就会返回一个socket对象
		System.out.println("有客户端接入了......");
		// 3. io流（交流沟通）
		// 3.1说的流------OutputStream
		OutputStream os = socket.getOutputStream();// 字节流
		// 转换流 OutputStreamWrite
		// new OutputStreamWriter(os)字节流转字符流 字符流转换成换成流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		// 3.2听的流----InputStream
		InputStream in = socket.getInputStream();
		// 转换流 InputStreamReader
		// new InputStreamReader(in)字节流转字符流 字符流转换成换成流
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		// 1.开始读线程和写线程
		WriterThread wt = new WriterThread(bw);
		ReaderThread rt = new ReaderThread(br);
		// 启动线程
		wt.start();
		rt.start();
		// 4.关流（挂电话）
		// isAlive 是活的
		if (!wt.isAlive() && !rt.isAlive()) {
			br.close();
			in.close();
			bw.close();
			os.close();
		}

	}
}
