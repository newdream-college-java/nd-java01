package zuoye;
import java.util.Scanner;
public class Account {
	int choice;
	int sum;
	public int show(){
		Scanner input=new Scanner(System.in);
		System.out.println("1.��� 2.ȡ�� 0.�˳�");
		System.out.print("��ѡ������Ҫ�����ҵ��");
		choice=input.nextInt();
		return choice;
	}
	public void service(int sum){
		Scanner input=new Scanner(System.in);
		switch(show()){
			case 1:
				System.out.println("���������");
				int money=input.nextInt();
				sum+=money;
				System.out.println("���ɹ�\n");
				System.out.println("***��ǰ���Ϊ��"+sum+"Ԫ***");
				service(sum);
				break;
			case 2:
				System.out.println("������ȡ���");
				int money1=input.nextInt();
				if(sum-money1>=0){
					sum-=money1;
					System.out.println("ȡ��ɹ�\n");
					System.out.println("***��ǰ���Ϊ��"+sum+"Ԫ***");
				}else{
					System.out.println("���㣬ȡ��ʧ��\n");
				}
				service(sum);
				break;
			case 0:
				System.out.println("ллʹ�ã�");
				System.exit(-1);;
		}
	}
}
