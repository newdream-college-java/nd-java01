package 第16章多态作业;

public class Dog extends Pet{
	public void play(){
		setLove(getLove()+5);
		System.out.println("主人和狗子"+getName()+"正在接飞盘"+"其健康值减少10，亲密值增加5！健康值现为:"+getHealth()+"亲密值现为:"+getLove());
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		
		
	}
	public void eat(){
		setHealth(getHealth()+3);
		System.out.println("狗吃狗粮了健康值+3现在的健康值为："+getHealth());
		chiBaoLe();
	}
	public void chiBaoLe(){
		if(getHealth()>=100){
			System.out.println("狗吃饱了，不能再吃了");
			setHealth(100);
		}
	}
//	public void play(){
//		System.out.println("主人和狗玩了接飞盘,健康值"+getHealth()-10);
//	}
}
