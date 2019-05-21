package com.cc.tcps;

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

import com.cc.tcp.thread.ReaderThread;
import com.cc.tcp.thread.WriterThread;



public class Cilent {
	public static void main(String[] args) throws UnknownHostException, IOException{
		Scanner input=new Scanner(System.in);
		Socket socket=new Socket("127.0.0.1", 10086);
		OutputStream os=socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));// 字节流转字符流 字符流缓存流

        InputStream in = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));// 字节流转字符流 字符流转换成换成流

        WriterThread wt =new WriterThread(bw);
        ReaderThread rt = new ReaderThread(br);
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
