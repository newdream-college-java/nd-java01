package zuoye;

import java.io.BufferedWriter;
import java.util.Scanner;

public class WriterThread extends Thread {
	// 定义属性以获取BufferedWriter的值
	private BufferedWriter bw;

	public WriterThread(BufferedWriter bw) {
		this.bw = bw;
	}

	@Override
	public void run() {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("客服请输入：");
				String ask = input.next();
				bw.write(ask + "\n");
				bw.flush();// 刷新缓存

				if (ask.equals("88")) {
					System.out.println("写线程结束！！");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
