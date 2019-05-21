import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* @author mo
* @version 2019年5月21日 下午8:19:07
* @description
*/
public class WriteThread extends Thread{
	private BufferedWriter writer;
	public WriteThread(BufferedWriter writer) {
		this.writer=writer;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("客服请输入：");
				String ask=input.next();
				writer.write(ask+"\n");
				writer.flush();
				if(ask.equals("88")) {
					System.out.println("写线程结束");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
