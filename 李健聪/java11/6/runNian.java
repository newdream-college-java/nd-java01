package shiyizhang;

import java.util.Scanner;

public class runNian {
	Scanner input=new Scanner(System.in);
	public void cxrn(){
		int a=input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println(a+"��������");
		}else{
			System.out.println(a+"�겻������");
		}
	}
}
