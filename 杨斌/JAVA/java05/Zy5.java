import java.util.Scanner;
public class Zy5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.print("������һ��0��2������");
			int a=input.nextInt();
			i++;
			switch(a){										
				case 0:
					System.out.println("������Ǽ���");
					break;
				case 1:
					System.out.println("������ǲ�");
					break;
				case 2:
					System.out.println("�������ʯͷ");
					break;
				default:
					i=0;
					break;
				
			}	
			
			
			
			


		}

	}


}