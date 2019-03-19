package exercise1;
/**
 * 使用接口表示编码和讲解业务这两种能力，让软件工程师既能编码又能讲解业务
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Prorammer prorammer=new Prorammer("小明","软件工程师");
		prorammer.writeCode();
		prorammer.tallAbout();
	}
}
