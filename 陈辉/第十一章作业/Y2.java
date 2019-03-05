package java11;
import java.util.Scanner;
public class Y2 {
	String name;
	String mima;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println();
		System.out.println("1登录系统");
		System.out.println();
		System.out.println("2退出");
		System.out.println("请选择，输入数字：");
		int a=0;
		a =input.nextInt();
		if(a==1){
			System.out.println("欢迎进入主菜单");
		}
	}
	public void dan(){
		Scanner input=new Scanner(System.in);
		System.out.println("1客户管理系统");
		System.out.println("2真情回馈");
		System.out.println("请选择输入或按0返回上一级菜单：");
		int b =0;
		b =input.nextInt();
		if(b==2||b==0){
			System.out.println("返回上一级菜单");
		}
	}
	public void hui(){
		Scanner input=new Scanner(System.in);
		System.out.println("1:幸运大放送");
		System.out.println("2:幸运抽奖");
		System.out.println("3:生日问候");
		System.out.println("请选择输入或按0返回上一级菜单：");
		int c =0;
		c =input.nextInt();
		if(c==1||c==0){
			System.out.println("返回上一级菜单");
		}
		int k=3;
		switch(k){
		 	case 1:
		 		System.out.println("幸运大放送");
		 	case 2:
		 		System.out.println("幸运抽奖");
		 	case 3:
		 		System.out.println("生日问候");		 	
		}
		
	}

}	
		
	
