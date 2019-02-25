import java.util.Scanner;
public class java07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("循环输入大于0的数，输入0结束，并输出结果");
		double sum =input.nextDouble();
		while(sum>0){
			System.out.println("请输入一个数字");
			double b = input.nextDouble();
			if(b>0){
				sum+=b;
			}else{
				System.out.println(sum);
				break;
			}

		}
	}
}