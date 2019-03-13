package 人与宠物;

public  class Dog extends Pet{
	
	public void eat() {
		System.out.println("狗狗欧欧吃饱啦，健康值增加3.....");
		setHealth(getHealth()+3);
	}
	public void eat1(){
		System.out.println("狗狗欧欧正在接飞盘。健康值减少10，亲密值增加5！");
		setAffinity(getAffinity()+5);
		setHealth(getHealth()-10);
	}
}
