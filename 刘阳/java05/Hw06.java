import java.util.Random;
import java.util.Scanner;
public class Hw06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd= new Random();
		int pk=rd.nextInt(3)+1;
		System.out.println("请输入你想出的手势："+"\n1.石头"+"\n2.剪刀"+"\n3.布");
		int a =input.nextInt();
		if(a==1&&pk==1){
			System.out.print("你出了石头；电脑出了石头；----平局");
		}else if(a==1&&pk==2){
			System.out.print("你出了石头；电脑出了剪刀；----恭喜！你赢了！");
		}else if(a==1&&pk==3){
			System.out.print("你出了石头；电脑出了布；----很遗憾！你输了！");
		}
		if(a==2&&pk==1){
			System.out.print("你出了剪刀；电脑出了石头；----很遗憾！你输了！");
		}else if(a==2&&pk==2){
			System.out.print("你出了剪刀；电脑出了剪刀；----平局");
		}else if(a==2&&pk==3){
			System.out.print("你出了剪刀；电脑出了布；----恭喜！你赢了！");
		}
		if(a==3&&pk==1){
			System.out.print("你出了布；电脑出了石头；----恭喜！你赢了！");
		}else if(a==3&&pk==2){
			System.out.print("你出了布；电脑出了剪刀；----很遗憾！你输了！");
		}else if(a==3&&pk==3){
			System.out.print("你出了布；电脑出了布；----平局");
		}
	}	
}