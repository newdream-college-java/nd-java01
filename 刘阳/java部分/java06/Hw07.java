import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		System.out.println("请输入需要累加的数字：");
		double num=input.nextDouble();
		for(;num>=0;){
			if(num>0){
			sum+=num;
			System.out.println("请输入需要累加的数字：");
			num=input.nextDouble();
			}else{
				System.out.println("累加结果为："+sum);
				break;
			}
		}
		
	}
}