package Test02;

public class Penguin extends Pet{

	@Override
	public void game() {
		// TODO Auto-generated method stub
		setHealth(10);
		setLove(5);
		System.out.println("企鹅楠楠正在游泳。健康值减少"+getHealth()+"亲密值增加"+getLove());
	}
}

