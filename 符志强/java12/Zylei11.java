import java.util.Random;
public class Zylei11 {
	String xm;
	int jifen;
	public int diannao() {
		Random input=new Random();
		int s=input.nextInt(3)+1;
		switch (s) {
		case 1:
			System.out.println(xm+"�����Ǽ���");
			break;
		case 2:
			System.out.println(xm+"������ʯͷ");
			break;
		case 3:
			System.out.println(xm+"�����ǲ�");
			break;
		}
	return s;
	}
}
