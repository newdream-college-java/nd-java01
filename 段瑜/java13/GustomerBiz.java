package ��ҵ;

import java.util.Scanner;

public class GustomerBiz {
	String[] names=new String[5];
	 String yn;
	public void show(String name){
		Scanner input=new Scanner(System.in);
		boolean falg=false;
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				falg=true;
				names[i]=name;
				break;
			}
		}
		if(!falg){
			System.out.println("¼��ʧ��");
		}
	}	
	public void show1(){
		System.out.println("**********************");
		System.out.println("\t�ͻ������б�");
		System.out.println("**********************");
		for (int j = 0; j < names.length; j++) {
			System.out.print(names[j]+"\t");
		}
	}
}
