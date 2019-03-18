package java16;
/**
 * 给狗狗喂食，其健康值增加3，输出吃饱信息！
 * 给企鹅喂食，其健康值增加5，输出吃饱信息！
 * 给猫咪喂食，其健康值增加4，输出吃饱信息！
 * @author mo
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Master m=new Master();
		Pet dog=new Dog();
		dog.setName("欧欧");
		m.feed(dog);
		Pet penguin=new Penguin();
		penguin.setName("楠楠");
		m.feed(penguin);
		Pet cat=new Cat();
		cat.setName("汤姆");
		m.feed(cat);
	}
}
