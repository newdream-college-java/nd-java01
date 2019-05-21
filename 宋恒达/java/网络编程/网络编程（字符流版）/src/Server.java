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

/**
* @author mob
* @version 2019��5��21�� ����11:18:19
* @description
*/
public class Server {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		ServerSocket serverSocket=new ServerSocket(10086);
		System.out.println("������������");
		Socket server=serverSocket.accept();
		System.out.println("�пͻ��˽�����");
		OutputStream os=server.getOutputStream();
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(os));
		InputStream in=server.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
//		writer.write("������Ϣ�ɹ�\r\n");
//		writer.flush();
//		String content=reader.readLine();
//		if(content!=null) {
//			System.out.println("�ͻ�˵��"+content);
//		}
		while(true) {
			System.out.print("�ͷ����룺");
			String msg=input.next();
			writer.write(msg+"\n");
			writer.flush();
			String content=reader.readLine();
			if(content!=null) {
				System.out.println("�ͻ�˵��"+content);
			}
			if(msg.equals("88")&&content.equals("88")) {
				System.out.println("�ҵ绰��");
				break;
			}
		}
		reader.close();
		in.close();
		writer.close();
		os.close();
		server.close();
		serverSocket.close();
	}
}
