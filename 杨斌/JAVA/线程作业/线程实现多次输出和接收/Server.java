package com.cc;
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		WriterThread wt=null;
		ReaderThread rt=null;
		OutputStream os=null;
		BufferedWriter bs=null;
		InputStream in=null;
		BufferedReader br=null;
		try {
			ServerSocket so=new ServerSocket(5200);
			System.out.println("服务器已启动");
			Socket sock=so.accept();
			System.out.println("已监听到客户端");
			os=sock.getOutputStream();
			bs=new BufferedWriter(new OutputStreamWriter(os));
			in=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(in));
			wt=new WriterThread(bs);
			rt=new ReaderThread(br);
			wt.start();
			rt.start();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(!wt.isAlive()||!rt.isAlive()) {
				try {
					br.close();
					in.close();
					bs.close();
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
	}
}
