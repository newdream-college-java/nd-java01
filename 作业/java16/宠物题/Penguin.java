package 第16章多态作业;

public class Penguin extends Pet{
	public void play(){
		setLove(getLove()+5);
		System.out.println("主人和企鹅"+getName()+"正在游泳"+"其健康值减少10，亲密值增加5！健康值现为:"+getHealth()+"亲密值现为:"+getLove());
		setHealth(getHealth()-10);
		setLove(getLove()+5);
	}
	public void eat(){
		setHealth(getHealth()+5);
		System.out.println("企鹅吃鱼了健康值+5现在的健康值为："+getHealth());
		chiBaoLe();
	}
	public void chiBaoLe(){
		if(getHealth()>=100){
			System.out.println("企鹅吃饱了，不能再吃了");
			setHealth(100);
		}
	}

}
