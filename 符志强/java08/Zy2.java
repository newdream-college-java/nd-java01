import java.util.Scanner;
public class Zy2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入你的成绩");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			sum++;
		}
		System.out.println("大于80分都有"+sum+"人");
	}
}