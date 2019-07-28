import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i>=1;i++){
			System.out.print("请随机输入数字，输入0结束：");
			int a=input.nextInt();
			if(a==0){
				break;
			}else{
				
				sum+=a;
			}
		}
		System.out.print(sum);
	}

}