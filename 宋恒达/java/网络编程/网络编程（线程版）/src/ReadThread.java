import java.io.BufferedReader;
import java.io.IOException;

/**
* @author mo
* @version 2019��5��21�� ����8:18:56
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
	                System.out.println("�����ͻ�˵��" + content);
	                if (content.equals("88")) {
	                    System.out.println("���߳̽���������");
	                    break;
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }
	}
}
