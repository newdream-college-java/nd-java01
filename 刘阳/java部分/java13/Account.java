package zuoye;
import java.util.Scanner;
public class Account {
	int choice;
	int sum;
	public int show(){
		Scanner input=new Scanner(System.in);
		System.out.println("1.存款 2.取款 0.退出");
		System.out.print("请选择你需要办理的业务：");
		choice=input.nextInt();
		return choice;
	}
	public void service(int sum){
		Scanner input=new Scanner(System.in);
		switch(show()){
			case 1:
				System.out.println("请输入存款金额：");
				int money=input.nextInt();
				sum+=money;
				System.out.println("存款成功\n");
				System.out.println("***当前余额为："+sum+"元***");
				service(sum);
				break;
			case 2:
				System.out.println("请输入取款金额：");
				int money1=input.nextInt();
				if(sum-money1>=0){
					sum-=money1;
					System.out.println("取款成功\n");
					System.out.println("***当前余额为："+sum+"元***");
				}else{
					System.out.println("余额不足，取款失败\n");
				}
				service(sum);
				break;
			case 0:
				System.out.println("谢谢使用！");
				System.exit(-1);;
		}
	}
}
