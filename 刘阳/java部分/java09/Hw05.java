import java.util.Scanner;
import java.util.Arrays;
public class Hw05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a={0,0,0};
		double sum=0;
		int[] b=new int[10];
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个学生的成绩：");
			int score=input.nextInt();
			b[i-1]=score;
			if(score<60){
				a[0]++;
			}else if(score>=60&&score<80){
				a[1]++;
			}else{
				a[2]++;
			}
			sum+=score;
			
		}
		Arrays.sort(b);
		System.out.println("60分以下的有："+a[0]+"个。");
		System.out.println("60分到80分的有："+a[1]+"个。");
		System.out.println("80分以上的有："+a[2]+"个。");
		System.out.println("最大值为："+b[9]);
		System.out.println("最小值为："+b[0]);
		System.out.println("平均数为："+sum/10);
	}
}