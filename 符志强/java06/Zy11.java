import java.util.Scanner;
public class Zy11{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����fzq");
			
		System.out.print("���������룺123456");
			
		System.out.println("��ӭ��¼MyShoppingϵͳ");
		
		
		for(int i=3;i>=1;i--){
			System.out.print("�������û�����");
			String mz=input.next();
			System.out.print("���������룺");
			String mm=input.next();
			if(mz.equals("fzq")||mm.equals("123456")){
				break;
			}else{
				System.out.println("�������������"+(i-1)+"����");
			}if(i==1){
				System.out.print("�Բ�����3�ξ��������");
			}
		}
		
	}
}