import java.util.Scanner;
public class java11{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int j=3;
		int password;
		String name;
		for(int i =1;i<=3;i++){
			System.out.print("�������û���:");
			name = input.next();
			System.out.print("����������:");
			password = input.nextInt();
			if((!name.equals("jim"))||(password!=123456)){
				j--;
				System.out.println("�������,����ʣ��"+j+"�λ���");
			}else{
				System.out.println("��ӭ��½MyShoppingϵͳ!");
				break;
			}
		}
	}

}