package 人与宠物;

public  class Cat extends Pet{
	public void eat(){
		System.out.println("猫咪汤姆吃饱啦，健康值增加4.......");
		setHealth(getHealth()+4);
	}

	@Override
	public void eat1() {
		
		
	}
}
