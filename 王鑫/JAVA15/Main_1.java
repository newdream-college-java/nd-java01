package Tast2019_3_11_z15;

import java.util.Random;
import java.util.Scanner;

public class Main_1 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("请输入租赁天数：");
			int day = input.nextInt();
			System.out.print("请输入机动车类型（1.轿车 2.客车）：");
			int n = input.nextInt();
			String cx;
			String lx;
			int jg;
			if (n==1) {
				System.out.println("请选择车型（1.GL8 2.宝马 3别克林荫大道）：");
				n = input.nextInt();
				Random rd = new Random();
				if (n==1) {
					n = rd.nextInt(1000);
					Car_1 car = new Car_1(("京Gk"+n),day,"别克商务舱GL8",600);
				}else if (n==2) {
					Car_1 car = new Car_1(("京Gk"+n),day,"宝马550i",500);					
				}else if (n==3) {
					Car_1 car = new Car_1(("京Gk"+n),day,"别克林荫大道",300);					
				}
			}else if(n==2){
				
			}
			
	}
}
