package Test2019_3_6_z13;

public class Grant {
	public Grant(int money,int year) {
		if (year==1) {
			//利率
			double ll = money*0.0425;
			System.out.println("你每月需还款："+(money+ll)/year/12+"元");			
		}else if (year<=5) {
			double ll = money*0.0475;
			System.out.println("你每月需还款："+(money+ll)/year/12+"元");		
		}else {
			double ll = money*0.049;
			System.out.println("你每月需还款："+(money+ll)/year/12+"元");		
		}
	}
}
