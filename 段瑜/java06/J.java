import java.util.Scanner;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=2;
		int c=123456;
		while(i>=0&&i<3){
			System.out.println("�������û�����"); 
			String b=input.next();
			System.out.println("���������룺");
			int sum=input.nextInt();
			if(b.equals("jim")&&c==sum){
				System.out.println("��ӭ��½MyShoppingϵͳ��");
				i=0;
			}else if(i==0){
				System.out.println("�Բ�����3�ξ��������");
				i--;
			}else{
				System.out.println("�������������"+i+"����");
				i--;
			}
			
		}
	}
}