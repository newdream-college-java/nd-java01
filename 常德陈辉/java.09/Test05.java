/*输入10个学生的单科成绩，并求出成绩在60分以下（不含）、60-80分（含60不含80）和80分以上的学生各有多少个？并求出最高分、最低分和平均分*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=10;
		double sum=0;
		int b=0,c=0,d=0;
		double[] arr=new double[a];
		for(int i=0;i<arr.length;i++){
			System.out.print("第"+(i+1)+"个学生的成绩：");
			arr[i]=input.nextDouble();
			sum+=arr[i];
			if(arr[i]<60){
				b++;
			}else if(arr[i]>=60&&arr[i]<80){
				c++;
			}else{
				d++;
			}
		}
		double max=0,min=0;
		max=arr[0];
		min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.print("成绩在60分以下的："+b+"个\n成绩在80到60分（包含60分）："+c+"个\n成绩在80分以上的（包含80分）："+d+"个\n");
		System.out.println("成绩最大值为："+max+"成绩最小值为："+min+"平均值为："+sum/arr.length);
	}
}