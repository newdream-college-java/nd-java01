import java.util.Random;


public class Com {
	String name;
	int score;
	public int chuquan(){
		Random rd=new Random();
		int choice=rd.nextInt(3)+1;
		switch(choice){
			case 1:
				System.out.println("���Գ�ȭ��ʯͷ��");
				break;
			case 2:
				System.out.println("���Գ�ȭ��������");
				break;
			case 3:
				System.out.println("���Գ�ȭ������");
				break;
		}
		return choice;
	}
}
