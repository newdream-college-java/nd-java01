import java.util.Scanner;
public class Person {
	String name;
	int score;
	public int showFist(){
		System.out.print("���ȭ��1.����2.ʯͷ3.��(������Ӧ����):");
		Scanner input=new Scanner(System.in);
		int cq=0;
		if(input.hasNextInt()) {
			cq=input.nextInt();
		}
		switch(cq){
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���ȭ����");
				break;
			default:
				System.out.println("�������");
				break;
		
		}
		return cq;
	}
}
