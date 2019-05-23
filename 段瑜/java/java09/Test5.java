import java.util.Scanner;
import java.util.Arrays;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] a;
		int b=0,c=0,d=0;
		double sum=0;
		a=new double[10];
		for(int i=0;i<a.length;i++){
			System.out.print("请输入第"+i+"名同学的成绩：");
			a[i]=input.nextDouble();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			if(a[i]<60){
				b+=1;
			}else if(a[i]>=80){
				c+=1;
			}else{
				d+=1;
			}
			sum+=a[i];
		}
		System.out.println("低于60分的有:"+b+"\t60~80分(含60不含80分)有："+d+"\t大于等于80分的有："+c+"\n最小值为："+a[0]+"\n最大值为："+a[10-1]+"\n平均值为："+sum/10);
		
	}
}