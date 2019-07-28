import java.util.Scanner;
public class Zy5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.print("请输入一个0到2的整数");
			int a=input.nextInt();
			i++;
			switch(a){										
				case 0:
					System.out.println("你出的是剪刀");
					break;
				case 1:
					System.out.println("你出的是布");
					break;
				case 2:
					System.out.println("你出的是石头");
					break;
				default:
					i=0;
					break;
				
			}	
			
			
			
			


		}

	}


}