
public class Zy2lei {
	String leixing;
	int jifen;
	public void a(){
		if(leixing.equals("金卡")){
			if(jifen>1000){
				System.out.println("回馈500积分");
			}else{
				System.out.println("没有回馈");
			}
		}
		if(leixing.equals("普通卡")){
			if(jifen>5000){
				System.out.println("回馈500积分");
			}else{
				System.out.println("没有回馈");
			}
		}
	}
}
