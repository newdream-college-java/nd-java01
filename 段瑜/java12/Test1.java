package �˻���ȭ;
import java.util.Random;
public class Test1 {
	String name;
	int score;
	public int jqr(){
		Random rd=new Random();
		int choice=rd.nextInt(2)+1;
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
			System.out.println();
			return choice;
			}
		
}
