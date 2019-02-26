import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要录入用户的数量");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			System.out.println("请输入第"+i+"用户的编号(<4位整数>)");
			int b=input.nextInt();
			for(;;){
				if(b/1000>0&&b/1000<10){
					System.out.println("请重新输入正确的编号");
				b=input.nextInt();
				}else{
				break;
				}
			}
			System.out.println("请输入用户的年龄");
			int c=input.nextInt();
			if(c<10){
			System.out.println("小屁孩玩什么游戏");
			System.exit(-1);
			}
			System.out.println("请输入用户的积分");
			int d=input.nextInt();
			System.out.println("这是第"+i+"位用户的信息:   "+"编号:  "+b+"   年龄:  "+c+"积分:  "+d);
			
		}
	}
}