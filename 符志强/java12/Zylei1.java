package zz;
import java.util.Scanner;

public class Zylei1 {
	Scanner input=new Scanner(System.in); 
	String name="��";
	int jf;
	public int quan() {
		System.out.println("���ȭ��1.Ϊ����s   2.Ϊʯͷ  3.Ϊ��");
		int a=input.nextInt();
		if (a>3||a<=0) {
			System.out.println("�������");
			System.exit(0);
		}
		switch (a) {
			case 1:
				System.out.println("�������Ǽ���");
				break;
			case 2:
				System.out.println("��������ʯͷ");
				break;
			case 3:
				System.out.println("�������ǲ�");
				break;
				
		}
		return a;
	}
}
