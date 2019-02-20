import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入小时");
		int a=input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.println("天数："+b+"\t小时："+c);

}
}