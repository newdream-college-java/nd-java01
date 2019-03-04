package Zy10;
public class Zy02 {
	int sum;
	String name;
	public void show(){
		if(name.equals("金卡")&&sum>1000){
			System.out.println("回馈积分500分！");
		}else if(name.equals("普通卡")&&sum>5000){
			System.out.println("回馈积分500分！");
		}else{
			System.out.println("积分不够，继续努力！");
		}
	}
	
}
