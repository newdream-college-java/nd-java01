/*第1名 麻省理工一个月夏令营
第2名 惠普笔记本电脑一部
第3名 移动硬盘一个
否则 不给任何奖励*/
import java.util.Scanner;
public class Hw03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入韩嫣获得了第几名："+"\t"+"（请输入整数）");
		//输入成绩
		int sc= input.nextInt();
		if(sc==1){
			System.out.print("奖励参加麻省理工大学组织的1个月夏令营！");
		}else if(sc==2){
			System.out.print("奖励获得惠普笔记本电脑一部！");
		}else if(sc==3){
			System.out.print("奖励移动硬盘一个！");
		}else{
			System.out.print("没有任何奖励");
		}
		
	}
}