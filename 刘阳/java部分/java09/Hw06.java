import java.util.Scanner;
public class Hw06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++) {
			System.out.println("请输入第"+i+"个整数：");
			int num=input.nextInt();
			if(num!=1&&num!=2&&num!=3) {
				count++;
			}	
		}
		System.out.println("整数的个数为："+(10-count)+"非法数字的个数为："+count);
	}
}