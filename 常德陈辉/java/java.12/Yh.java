import java.util.Scanner;

public class Yh {
	String name="��";
	int jf;
	public int showRg(){
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ��1,����  2��ʯͷ  3����");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���ȭ����");
				break;
		}
		return a;
	}

}
