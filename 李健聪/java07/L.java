import java.util.Scanner;
public class L{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i=3;i>0;i--){
			System.out.print("�����������û���:");
			String a=input.next();
			System.out.print("��������������:");
			String b=input.next();
			if(a.equals("jim")&&b.equals("123456")){
				System.out.println("��ӭ��½MyShopping");
				break;
			}else{
				System.out.println("�������������"+(i-1)+"�λ���");
			}if(i<=1){
			System.out.println("�Բ�����3�ξ��������!");
			}
		}
	}
}