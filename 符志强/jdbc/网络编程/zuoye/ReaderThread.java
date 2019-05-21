package zuoye;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderThread extends Thread {
	// 定义属性以获取BufferedReader的值
	private BufferedReader br;

	public ReaderThread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		while (true) {
			String content;
			try {
				content = br.readLine();
				System.out.println("听到客户说：" + content);
				if (content.equals("88")) {
					System.out.println("读线程结束！！！");
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
