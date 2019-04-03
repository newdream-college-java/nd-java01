package java16;
/**
 * 主人和狗狗玩接飞盘，其健康值减少10，亲密度增加5，输出玩耍信息
 * 主任和企鹅玩游泳，其健康值减少19，亲密度增加5
 * @author mo
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Master m=new Master();
		Pet dog=new Dog();
		dog.setName("欧欧");
		Pet penguin=new Penguin();
		penguin.setName("楠楠");
		m.playWithPet(dog);
		m.playWithPet(penguin);
	}
}
