import java.util.*;
public class work5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.print("请输入一个0到2之间的整数:");
			int a = input.nextInt();
			if(a==0){
				System.out.println("你出的是石头");
			}else if(a==1){
				System.out.println("你出的是剪刀");
			}else if(a==2){
				System.out.println("你出的是布");
			}else{
				System.out.println("输入错误,程序结束！");
				break;
			}
		}
		
	}
}