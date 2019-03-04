package test;

public class T1 {
	String name;
	int jifen;
	String jinka;
	public void show(){
		if(name.equals("金卡")){
			if(jifen>1000){
				System.out.println("回馈500积分");
			}else{
				System.out.println("没有积分回馈");
			}
		}
		if(name.equals("普通卡")){
			if(jifen>5000){
				System.out.println("获得500回馈积分");
			}else{
				System.out.println("没有回馈积分");
			}
		}
	}
	

}
