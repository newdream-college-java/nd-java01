import java.util.*;
public class work10{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);	
		for(int i = 1;i<=3;i++){
			System.out.println("�������Ա�ţ�<4λ����>����");
			int a = input.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			String b = input.next();
			System.out.print("�������Ա���֣�");
			int c = input.nextInt();
			if(a>=1000&&a<=9999){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.print(a+"  "+b+" "+c);
			}else{
				System.out.print("���Ļ�Ա�Ŵ���");
			
			}
		}
	}
}