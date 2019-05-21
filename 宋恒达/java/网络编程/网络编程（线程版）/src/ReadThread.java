import java.io.BufferedReader;
import java.io.IOException;

/**
* @author mo
* @version 2019年5月21日 下午8:18:56
* @description
*/
public class ReadThread extends Thread{
	private BufferedReader reader;
	public ReadThread(BufferedReader reader) {
		// TODO Auto-generated constructor stub
		this.reader=reader;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 while (true) {
	            String content;
	            try {
	                content = reader.readLine();
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
