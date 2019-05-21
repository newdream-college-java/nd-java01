package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class yonghu {

	public static void main(String[] args) throws Exception {
		// 输入函数
		Scanner input = new Scanner(System.in);

		// 1.得到电话和电话的人
		Socket socket = new Socket("127.0.0.1", 10086);
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
		// 获取用户数据
		String c = br.readLine();
		while (c != null) {

			System.out.println("听客服说：" + c);

			// 说
			System.out.println("用户说：");
			String s = input.next();
			bw.write(s + "\n");
			// 刷新缓存
			bw.flush();
			// 判断是否要挂电话
			if (s.equals("88") && c.equals("88")) {
				System.out.println("挂电话了");
				break;
			}
			// 继续读
			c = br.readLine();
		}

		// 关流
		br.close();
		in.close();
		bw.close();
		os.close();

	}

}
