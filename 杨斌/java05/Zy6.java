import java.util.Scanner;
import java.util.Random;
public class Zy6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd =new Random();
		int i=1;
		while(i!=0){
			System.out.print("�������ʯͷ����");
			String a=input.next();
			int num=rd.nextInt(2);
			i++;
			switch(num){										
				case 0:
					System.out.println("����");
					break;
				case 1:
					System.out.println("��");
					break;
				default:
					System.out.println("ʯͷ");
					break;
			
				
			}
				
			
			
			
			


		}

	}


}