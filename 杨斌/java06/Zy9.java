import java.util.Scanner;
public class Zy9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Myshopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		for(int i=1;i<=3;i++){
			System.out.println("�������Ա�ţ�4λ������");
			int a=input.nextInt();
			System.out.println("�������Ա���գ���/��<����λ������ʾ>��");
			String b=input.next();
			System.out.println("�������Ա����");
			int c=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�"+a+"\t"+b+"\t"+c);		
		}
		System.out.print("���������");
	}
		
}