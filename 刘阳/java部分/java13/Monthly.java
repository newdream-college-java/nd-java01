package zuoye;

import java.util.Scanner;

public class Monthly {
	double zongrate,yuegong;
	
	Scanner input=new Scanner(System.in);
	public void zlx(int daimoney,double lilv,int nianxian){
		zongrate=daimoney*lilv;
		yuegong=(zongrate+daimoney)/(nianxian*12);
		System.out.println("����ϢΪ��"+zongrate);
		System.out.println("�»�����Ϊ��"+yuegong);
	}
}
