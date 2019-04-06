package zuoye;

import java.util.Arrays;
import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[]a=new double[10];
		for(int i=0;i<=9;i++){
			System.out.println("请输入第"+(i+1)+"个学生成绩：");
			a[i]=input.nextDouble();
		}
		
		Arrays.sort(a);
		double sum=0;
		int b=0,c=0,d=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<60){
				b++;
			}else if(a[i]>=60&&a[i]<80){
				c++;
			}else{
				d++;
			}
			sum+=a[i];
		}
		System.out.println("小于60分的有"+b+"个，60-80分的有"+c+"个，大于80分的有"+d+"个");
		System.out.println("最大值为:"+a[a.length-1]+"最小值为："+a[0]+"平均分为："+sum/10.0);
	}

}
