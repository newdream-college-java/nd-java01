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

/**
* @author mo
* @version 2019��5��21�� ����7:53:08
* @description
*/
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input=new Scanner(System.in);
		Socket client=new Socket("127.0.0.1", 10086);
		InputStream in=client.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
		OutputStream os=client.getOutputStream();
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(os));
//		String content=reader.readLine();
//		if(content!=null) {
//			System.out.println("�ͷ�˵��"+content);
//		}
//		writer.write("���ϸ��¿���һ��5G�������ײ�\r\n ");
//		writer.flush();
//		while(true) {
//			String content=reader.readLine();
//			if(content!=null) {
//				System.out.println("�ͷ�˵��"+content);
//			}
//			System.out.print("�ͻ����룺");
//			String msg=input.next();
//			writer.write(msg+"\n");
//			writer.flush();
//			if(msg.equals("88")&&content.equals("88")) {
//				System.out.println("�ҵ绰��");
//				break;
//			}
//		}
		Thread write=new WriteThread(writer);
		Thread read=new ReadThread(reader);
		write.start();
		read.start();
		if(!write.isAlive()&&!read.isAlive()) {
			reader.close();
			in.close();
			writer.close();
			os.close();
		}
	}
}
