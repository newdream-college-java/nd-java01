import java.util.Scanner;
public class D03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("�����뺫�̻�õ�����(��������)");
	if(input.hasNextInt()==true){
	int num = input.nextInt();
	switch(num){
		case 1:
			System.out.println("������ʡ����ѧ��֯�� 1 ��������Ӫ");
		break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��");
		break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");
		break;
		default:
			System.out.println("��������");
		break;
	}
	}else{
		System.out.println("��������,�˳�����");
		System.exit(-1);
	}
}
}
