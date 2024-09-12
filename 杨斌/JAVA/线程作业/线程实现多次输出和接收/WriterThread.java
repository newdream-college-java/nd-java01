package com.cc;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterThread extends Thread {
	Scanner sc=new Scanner(System.in);
	private BufferedWriter bs;
	public WriterThread(BufferedWriter bs) {
		this.bs=bs;
	}
	@Override
	public void run() {
		while(true) {			
			try {
				System.out.println("你说：");
				String ans=sc.next();
				bs.write(ans+"\n");
				bs.flush();	
				if(ans.equals("拜拜")) {
					System.out.println("结束谈话");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
