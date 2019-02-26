import java.util.Scanner;
public class zy5{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入你要出的数：0为石头，1为剪刀，2为布");
	int  i=input.nextInt();
	while(i>=0&&i<=2){
		if(i==0){
			System.out.println("你出的是石头");
			break;
		}else 	if(i==1){
			System.out.println("你出的是剪刀");
			break;
		}else 	if(i==2){
			System.out.println("你出的是布");
			break;
		}
	}
	
	}
}