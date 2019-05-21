package com.cc.tcps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class WriterThread extends Thread{
	private BufferedWriter bw;
	public WriterThread(BufferedWriter bw){
		this.bw=bw;
	}
	@Override
	public void run() {
		Scanner input = new Scanner(System.in);
		while(true){
			try {
				System.out.print("客服说：");
				String ask=input.next();
				bw.write(ask+"\n");
				//刷新缓存流
				bw.flush();
				 if(ask.equals("88")) {
	                    System.out.println("写线程结束！！");
	                    break;
	                }
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
