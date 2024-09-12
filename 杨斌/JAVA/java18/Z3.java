package com.java.java18.Z3;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Z3 {
	static Logger log =Logger.getLogger(Z3.class);
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		try {
			System.out.println("请输入被除数");
			a=input.nextInt();
			System.out.println("请输入除数");
			b=input.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("出现异常");		
			
		}finally{
			System.out.println("感谢使用本程序");
		}
		
		

	}
	
}
