import java.util.Scanner;
public class Hw11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i =1;
		for(;i<=3;i++){
			System.out.println("�������û�����");
		String name=input.next();
		System.out.println("���������룺");
		int code=input.nextInt();
			if(name.equals("jim")&&code==123456){
				System.out.println("��ӭ��¼MyShoppingϵͳ!");
				System.exit(-1);
			}else if(!name.equals("jim")||code!=123456){
				System.out.println("�������������"+(3-i)+"�λ���!");
			}
			if(i==3){
				System.out.print("\n");
				System.out.println("�Բ�����3�ξ��������");
			}	
		}
		
	}
}
 