import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.println("请输入一个0到2之间的整数");
			int sum=input.nextInt();
			i++;
			switch(sum){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
					System.out.println("你出的是剪刀");
					break;
				case 2:
					System.out.println("你出的是布");
					break;
				default:
					i=0;
					break;
			}
			
		}
			
	}
}