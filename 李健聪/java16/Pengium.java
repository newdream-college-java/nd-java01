package 十六章作业;

public class Pengium extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("企鹅楠楠吃饱啦！健康值加5");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("企鹅楠楠正在游泳，健康值减少10，亲密度增加5！");
	}

}
