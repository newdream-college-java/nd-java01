package zuoye;

import java.util.Scanner;

public class Card {
	Scanner input = new Scanner(System.in);
	String cardName;
	int jifen;
	public void pan(){
		if((this.cardName=="金卡"&&this.jifen>=1000)||(this.cardName=="普卡"&&this.jifen>=5000)){
			System.out.println("回馈积分500");
		}else{
			System.out.println("不好意思，不满足回馈条件！");
		}
	}
}
