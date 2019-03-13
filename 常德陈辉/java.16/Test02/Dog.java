package Test02;

public class Dog extends Pet{

	@Override
	public void game() {
		// TODO Auto-generated method stub
		setHealth(10);
		setLove(5);
		System.out.println("狗狗欧欧正在接飞盘。健康值减少"+getHealth()+"亲密值增加"+getLove());
	}
	
}
