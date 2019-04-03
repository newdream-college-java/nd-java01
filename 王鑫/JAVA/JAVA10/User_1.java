package Test2019_3_3_第十章;

public class User_1 {
	int jf=3050;
	String lx="金卡";
	public void show(){
		System.out.println("积分："+jf+",卡类型："+lx);
		if (jf>1000&&lx.equals("金卡")||jf>5000&&lx.equals("普卡")) {
			System.out.println("回馈积分500分！");
		}else {
			System.out.println("不好意思，您不满足回馈要求！！！");
		}
	}
}
