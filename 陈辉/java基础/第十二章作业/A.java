import java.util.Random;

public class Computer {
	//����---���֣�����
	String name;
	int score;
	public int showFist(){
		Random rd = new Random();
		int choice = rd.nextInt(3)+1;
		switch(choice){
		case 1:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 2:
			System.out.println(name+"��ȭ������");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
			break;
		}
		return choice;
		
	}
}
