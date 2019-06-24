package java13;
import java.util.Scanner;
public class Account {
	int sum=0;
	void show9(){
		Scanner input=new Scanner(System.in);
		
		
		int c;
		do{
			System.out.println("请输入1：存款 2：取款 0：退出");
			System.out.println("请选择你需要办理的业务");
			c=input.nextInt();
			if(c==1){
				System.out.println("请输入存款金额");
				int q=input.nextInt();
				System.out.println("存款成功");
				sum=sum+q;
				System.out.println("当前存款为：");
				
			}else if(c==2){
				System.out.println("请输入取款金额");
				int q=input.nextInt();
				System.out.println("取款成功");
				sum=sum-q;
				
				
			}else if(c==0){
					System.out.println("谢谢使用！！！");
			}else{
				System.out.println("亲，请你从新输入");
			}		
			System.out.println("当前余额为："+sum);
			
		}while(c!=0);
	}
	/*void show1(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入1：存款 2：取款 0：退出");
		System.out.println("请选择你需要办理的业务");
		System.out.println("请输入存款金额");
		int q=input.nextInt();
		System.out.println("存款成功");
		System.out.println("当前存款为："+show()+q);
	}*/
}
