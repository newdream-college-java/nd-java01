package 十二章;

import java.util.Scanner;

public class youXi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name="asd";
		int count=0;
		int win = 0;
		int shu=0;
		Scanner input = new Scanner(System.in);
		System.out.println("-------------欢迎进入游戏世界-------------\n");
		System.out.println("\t\t******************");
		System.out.println("\t\t**   猜拳,开始   ***");
		System.out.println("\t\t******************");
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
		System.out.println("请选择对方角色(1：刘备2：孙权3：曹操)");
		int a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("您选择了与刘备对战");
			name="刘备";
			
			break;
		case 2:
			System.out.println("您选择了孙权对战");
			name="孙权";
			break;
		case 3:
			System.out.println("您选择了曹操对战");
			name="曹操";
			break;
		}
		System.out.println("请输入你的姓名：");
		String name1=input.next();
		System.out.println(name1+"VS"+name);
		
		Computer com=new Computer();
	
		User user=new User();
		while(true){
			System.out.println("要开始吗？（y/n）");
			String answer=input.next();
			System.out.println("请出拳1.剪刀 2.石头 3.布");
			if(answer.equals("y")){
				user.cq();
				com.cq();
				int n=user.a;
				int m=com.a;
				if(n-m==-2||n-m==1){
					System.out.println("恭喜你，你赢了");
					win=user.score;
					win++;
					count++;
				}else if(n-m==-1||n-m==2){
					System.out.println("很遗憾，你输了");
					shu=com.score;
					shu++;
					count++;
				}else{
					System.out.println("平局哟，加油哟");
					count++;
				}
			}else if(answer.equals("n")){
				System.out.println(name+"VS"+name1);
				System.out.println("对战次数"+count);
				if(win>shu){
					System.out.println("结果：哇，你赢了啊，厉害呢");
					break;
				}else if(win<shu){
					System.out.println("结果：呵呵，笨笨，下次加油啊!");
					break;
				}else{
					System.out.println("结果：打平了，下次加油吧");
					break;
				}
			}
		}
	
		
		
		
	}

}
