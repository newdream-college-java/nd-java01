import java.util.Scanner;
public class TestDogPenguin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog01 dog=new Dog01();
		Penguin01 penguin=new Penguin01();
		System.out.println("��ӭ��������꣡");
		System.out.println("������Ҫ������������֣�");
		String petname=input.next();
		System.out.println("������Ҫ�����ĳ������ͣ� ��1������   2����죩");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				dog.setName(petname);
				System.out.println("��ѡ�񹷹���Ʒ�֣� ��1����������������Ȯ   2������ѩ����");
				int choice02=input.nextInt();
					switch(choice02){
						case 1:
							dog.setStrain("��������������Ȯ");
						break;
						case 2:
							dog.setStrain("����ѩ����");
						break;
					}
				break;
			case 2:
				penguin.setName(petname);
				break;
			default:
				System.out.println("�Բ��𣬱���û���������ĳ��");
				System.exit(-1);
		}
		if(choice==1){
			dog.print();
		}else if(choice==2){
			penguin.print();
		}
		
		
	}

}
