package com.cc;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderThread extends Thread {
	private BufferedReader br;
	public ReaderThread(BufferedReader br) {
		this.br=br;
	}
	@Override
	public void run() {
		while(true) {
			String cont="";
				try {
					cont=br.readLine();
					System.out.println("对方说："+cont);	
					if(cont.equals("拜拜")) {
						System.out.println("听到"+cont);	
						break;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
	}
}
