package exercise6;
/**
 * 定义动物Animal接口，定义方法shout()表示动物叫声
 * 定义狗类Dog,定义猫类Cat，分别实现Animal接口
 * 定义商店类Store，设计静态方法，根据客户输入的类型返回动物对象
 * 编写测试类，通过Store类的静态方法get创建一只宠物，输出宠物叫声
 * 扩展添加猪类w
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=Store.getPet("狗");
		animal.shout();
		Animal animal1=Store.getPet("pig");
		animal1.shout();
	}
}
