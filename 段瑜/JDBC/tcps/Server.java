package com.cc.tcps;

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

public class Server {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		//启动服务器！
		ServerSocket server=new ServerSocket(10086);
		System.out.println("服务器已启动！");
		//监听ServerSocket对象
		Socket socket=server.accept();
		System.out.println("客户端已接入");
		OutputStream os=socket.getOutputStream();
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
		InputStream in=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		WriterThread wt=new WriterThread(bw);
		ReaderThread rt=new ReaderThread(br);
		wt.start();
		rt.start();
		if(!wt.isAlive()&&!rt.isAlive()) {
	            br.close();
	            in.close();
	            bw.close();
	            os.close();
	        }
	}
}
