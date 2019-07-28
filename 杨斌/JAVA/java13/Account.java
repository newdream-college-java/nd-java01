import java.util.Scanner;
public class Account {
	int ye;
	int ck;
	int qk;
	
	public void show(int ye){
		Scanner input =new Scanner(System.in);
		int a;
		do{
			System.out.println("1.存款2.取款0.退出");
			System.out.print("请选择你需要办理的业务：");
			a=input.nextInt();
			if(a==1){
				System.out.print("请输入存款金额：");
				ck=input.nextInt();
				ye+=ck;
				System.out.println("存款成功");
				System.out.print("\n***当前余额为："+ye+"***\n");
				
			}else if(a==2){
				System.out.print("请输入取款金额：");
				qk=input.nextInt();
				
				if(ye>=qk){
					ye-=qk;
					System.out.println("取款成功");
					System.out.print("\n***当前余额为："+ye+"***\n");
				}else{
					System.out.print("余额不足，请重新输入\n");
					
				}
			}else{
				System.out.print("输入错误，请重新输入");
			}
		}while(a!=0);
		System.out.print("谢谢使用");
	}
}
