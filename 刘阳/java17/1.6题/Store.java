import java.util.Scanner;


public class Store {
	public static void get(){
		Scanner input=new Scanner(System.in);
		Animal animal = null;
		//ѡ��������
		System.out.println("��ѡ����Ҫ�Ķ���ı�ţ���1.���� 2.è�䣩");
		int choice=input.nextInt();
		if(choice==1){
			animal=new Dog();
		}else if(choice==2){
			animal=new Cat();
		}
		animal.shout();
	}
}
