package ��ʮ������ҵ;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	String a;
	public void addkh(){
		String[] name=new String[4];
		for(int i=0;i>=0;i++){
			System.out.print("������ͻ���������");
			a=input.next();
			name[i]=a;
			System.out.println("���������𣿣�y/n��");
			String b=input.next();
			if(b.equals("y")){
				continue;
			}
			else if(b.equals("n")){
				System.out.println("**********************");
				System.out.println("�ͻ������б�");
				System.out.println("**********************");
				System.out.print(Arrays.toString(name));
				
			}
			
		}
	}
	

}
