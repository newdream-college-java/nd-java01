/**
**�û���֤��¼����֤�������3��
**/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("�������û�����");
			String a=input.next();
			System.out.print("���������룺");
			String b=input.next();
			if((a.equals("jim"))&&(b.equals("123456"))){
				System.out.println("��ӭ��¼MyShoppingϵͳ!");
				break;
			}
			System.out.println("�������������"+(3-i)+"�λ���!");
			if(i==3){
				System.out.println();
				System.out.println("�Բ�����3�ξ��������");
			}
		}
	}
}