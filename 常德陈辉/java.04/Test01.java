/*猴子去买桃，如果买3个以下，老板就不送桃，如果买3个到5个就再送一个桃，如果买5个以上就送2个桃，现在要求输入猴子的买桃数，最后输出到底买到了几个桃。*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入要买几个桃：");
	int number=input.nextInt();
	if(number<3){
		System.out.print(number+"个");
		}else if(number>=3&&number<=5){
			number--;
			System.out.print(number+"个");
			}else if(number>5){
				number-=2;
				System.out.print(number+"个");
				}
	}

}