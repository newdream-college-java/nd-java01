import java.util.Scanner;
public class java09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int age1=0;
		int age2=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"位顾客的年龄");
			int age =input.nextInt();
			if(age<=30){
				age1++;	
			}else{
				age2++;
			}
		}
		System.out.println("30岁以下的比例是："+(age1/10.0*100)+"%");
		System.out.println("30岁以上的比例是："+(age2/10.0*100)+"%");
	}
}