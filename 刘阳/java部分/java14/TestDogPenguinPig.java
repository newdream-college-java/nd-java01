import java.util.Scanner;


public class TestDogPenguinPig {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.println("������Ҫ������������֣�");
		String name=input.next();
		System.out.println("������Ҫ�����ĳ������ͣ���1������  2�����  3����");
		int type=input.nextInt();
		switch(type){
			case 1:
				Dog02 dog=new Dog02(name,100,80);
				dog.choicestrain();
				dog.show();
				break;
			case 2:
				Penguin02 Penguin=new Penguin02(name,100,80);
				Penguin.choicestrain();
				Penguin.show();
				break;
			case 3:
				Pig pig=new Pig(name,100,80);
				pig.choicestrain();
				pig.show();
				break;
		}
	}

}
