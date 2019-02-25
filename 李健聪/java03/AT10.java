import java.util.Scanner; //根据存款来买车
public class AT10{
	public static void main(String[] main){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的存款\t");
		double ck = input.nextDouble();
		if(ck>5000000){
			System.out.println("您可以买凯迪拉克");
		}else if(ck>1000000){
			System.out.println("您可以卖帕萨特");
		}else if(ck>500000){
			System.out.println("您可以买伊兰特");
		}else if(ck>100000){
			System.out.println("您可以买奥拓");
		}else   	System.out.println("你还是买捷安特吧");
	}
}