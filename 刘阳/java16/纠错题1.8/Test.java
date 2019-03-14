

public class Test {
	public static void main(String[] args) {
		Chinese ch=new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p=new Chinese();
		p.eat();
		p.sleep();
		//p.shadowBoxing();父类里面没有shadowBoxing的方法。
		//shadowBoxing方法是子类特有的，解决办法是往下强制转化。
		Chinese a=(Chinese) p;
		a.shadowBoxing();
	}
}
