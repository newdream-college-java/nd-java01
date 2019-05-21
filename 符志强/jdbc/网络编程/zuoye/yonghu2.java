package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.cc.tcp.thread.ReaderThread;
import com.cc.tcp.thread.WriterThread;

public class yonghu2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		// 1.得到电话和电话的人
		Socket socket = new Socket("127.0.0.1", 10086);

		// 2.交流
		// 2.1说的流------OutputStream
		OutputStream os = socket.getOutputStream();// 字节流
		// 转换流 OutputStreamWrite
		// new OutputStreamWriter(os)字节流转字符流 字符流转换成换成流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));// 字节流转字符流 字符流缓存流
		// 2.2听的流----InputStream
		InputStream in = socket.getInputStream();
		// 转换流 InputStreamReader
		// new InputStreamReader(in)字节流转字符流 字符流转换成换成流
		BufferedReader br = new BufferedReader(new InputStreamReader(in));// 字节流转字符流 字符流转换成换成流
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
