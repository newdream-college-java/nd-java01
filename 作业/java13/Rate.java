package ��13����ҵ;

import java.util.Scanner;

public class Rate {
	double rate=0.06;
	double allrate ;
	double monthPayMoney;
	Scanner input =new Scanner(System.in);
	public void allRate(int money){
		allrate = money*rate;
		System.out.print("��������Ĵ�������");
		int year=input.nextInt();
		monthPayMoney=(allrate+money)/(year*12);
	}
	public String show(){
		return "����ϢΪ��"+allrate+"\t�»�����Ϊ��"+monthPayMoney;
	}
}
