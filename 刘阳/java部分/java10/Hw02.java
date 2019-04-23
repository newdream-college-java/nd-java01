
public class Hw02 {
	String type;
	int score;
	public void huikui(){
		if(type.equals("金卡")){
			if(score>1000){
				System.out.println("积分："+score+", 卡类型："+type);
				System.out.println("回馈积分500分！");
			}
		}else if(type.equals("普卡")){
			if(score>5000){
				System.out.println("积分："+score+", 卡类型："+type);
				System.out.println("回馈积分500分！");
			}
		}
	}
}
