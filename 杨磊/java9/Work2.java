package zuoye;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] a={0,0,0,0,0};
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个购物金额：");
			double b = input.nextDouble();
			a[i]=b;
			sum+=a[i];
		}
		System.out.println("序号\t\t\t金额（元）");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" "+i+"\t\t\t"+a[i]);
			sum++;
			if(i==a.length-1){
				System.out.println("总金额"+"\t\t\t"+sum);
			}
		}
	}

}
