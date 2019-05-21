package com.cc.tcps;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderThread extends Thread{
	private BufferedReader bf;
	public ReaderThread(BufferedReader bf){
		this.bf=bf;
	}
	@Override
	public void run() {
		while(true){
			String content;
			try {
				content=bf.readLine();
				System.out.println("客户说："+content);
				if(content.equals("88")){
					System.out.println("结束进程");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
