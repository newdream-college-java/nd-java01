import java.util.Random;
public class Computer {
	String name;
	int score;
	public int jsj(){
		Random rd=new Random();
		int s=rd.nextInt(3)+1;
		switch(s){
		case 1:
			System.out.println("���Գ�ȭ������");
			break;
		case 2:
			System.out.println("���Գ�ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���Գ�ȭ����");
			break;
		default:
			System.out.println("�������");
			break;
	
		}
		return s;
	}
}
