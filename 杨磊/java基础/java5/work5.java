import java.util.*;
public class work5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.print("������һ��0��2֮�������:");
			int a = input.nextInt();
			if(a==0){
				System.out.println("�������ʯͷ");
			}else if(a==1){
				System.out.println("������Ǽ���");
			}else if(a==2){
				System.out.println("������ǲ�");
			}else{
				System.out.println("�������,���������");
				break;
			}
		}
		
	}
}