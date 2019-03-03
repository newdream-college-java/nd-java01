import java.util.Scanner;
public class Zy2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Zy2lei a=new Zy2lei();
		System.out.println("请输入卡的类型");
		a.leixing=input.next();
		System.out.println("请输入积分");
		a.jifen=input.nextInt();
		a.a();
	}

}
