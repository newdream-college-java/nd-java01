package zuoye;

import java.util.Scanner;

public class Card {
	Scanner input = new Scanner(System.in);
	String cardName;
	int jifen;
	public void pan(){
		if((this.cardName=="��"&&this.jifen>=1000)||(this.cardName=="�տ�"&&this.jifen>=5000)){
			System.out.println("��������500");
		}else{
			System.out.println("������˼�����������������");
		}
	}
}
