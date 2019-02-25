import java.util.*;
public class work6{
	public static void main(String []args){
		System.out.print("猜拳游戏\n");
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		String a = input.next();
		switch(a){
			case "0":
			case "石头":
				System.out.print("你出的是石头");
				break;
			case "1":
			case "剪刀":
				System.out.print("你出的是剪刀");
				break;
			case "2":
			case "布":
				System.out.print("你出的是布");
				break;
			default:
				System.out.print("输入错误");
				break;
		}
		int b = rd.nextInt(3);
		switch(b){
			case 0:
				System.out.print("电脑出的是石头");
				break;
			case 1:
				System.out.print("电脑出的是剪刀");
				break;
			case 2:
				System.out.print("电脑出的是布");
				break;

		}

	}
}