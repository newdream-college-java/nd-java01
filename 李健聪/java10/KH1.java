package dishizhang;

import java.util.Scanner;

public class KH1 {
	String name="金卡";
	int jf=3050;
	public void show(){
		if(jf>1000&&name.equals("金卡")||jf>5000&&name.equals("普卡")){
			System.out.println("您是金卡用户，您的积分超过了1000，反馈您500积分");
		}else{
			System.out.println("积分不达标，没有反馈哦");
		}
	}
}
