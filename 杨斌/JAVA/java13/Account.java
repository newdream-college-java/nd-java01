import java.util.Scanner;
public class Account {
	int ye;
	int ck;
	int qk;
	
	public void show(int ye){
		Scanner input =new Scanner(System.in);
		int a;
		do{
			System.out.println("1.���2.ȡ��0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��");
			a=input.nextInt();
			if(a==1){
				System.out.print("���������");
				ck=input.nextInt();
				ye+=ck;
				System.out.println("���ɹ�");
				System.out.print("\n***��ǰ���Ϊ��"+ye+"***\n");
				
			}else if(a==2){
				System.out.print("������ȡ���");
				qk=input.nextInt();
				
				if(ye>=qk){
					ye-=qk;
					System.out.println("ȡ��ɹ�");
					System.out.print("\n***��ǰ���Ϊ��"+ye+"***\n");
				}else{
					System.out.print("���㣬����������\n");
					
				}
			}else{
				System.out.print("�����������������");
			}
		}while(a!=0);
		System.out.print("ллʹ��");
	}
}
