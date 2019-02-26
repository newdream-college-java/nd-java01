import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int b=0;
		System.out.println("请分别输入5名学生的成绩");
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"个人的成绩");
			int a=input.nextInt();
			if(a<80){
				continue;
			}if(a>80){
				++b;
			}
		}System.out.println("一共有"+b+"个人的成绩大于80分");
	} 
}