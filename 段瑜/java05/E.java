import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.println("������һ��0��2֮�������");
			int sum=input.nextInt();
			i++;
			switch(sum){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
				default:
					i=0;
					break;
			}
			
		}
			
	}
}