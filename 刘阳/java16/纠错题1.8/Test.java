

public class Test {
	public static void main(String[] args) {
		Chinese ch=new Chinese();
		ch.eat();
		ch.sleep();
		ch.shadowBoxing();
		Person p=new Chinese();
		p.eat();
		p.sleep();
		//p.shadowBoxing();��������û��shadowBoxing�ķ�����
		//shadowBoxing�������������еģ�����취������ǿ��ת����
		Chinese a=(Chinese) p;
		a.shadowBoxing();
	}
}
