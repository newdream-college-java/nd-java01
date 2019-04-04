import java.util.Scanner;
public class Z5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a=new int[10];
		int g=0,z=0,d=0,sum=0;
		for(int i=0;i<a.length;i++){
			System.out.print("请输入第"+(i+1)+"名同学的成绩");
			a[i]=input.nextInt();
			if(a[i]>=80){
				g++;
			}else if(60<=a[i]&&a[i]<80){
				z++;
			}else{
				d++;
			}
			sum=sum+a[i];
		}
		System.out.println
		("80分以上的有:"+g+"个\n"+"60~80的有:"+z+"个\n"+"60分以下有:"+d+"个");
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		double avg=sum*1.0/a.length;
		System.out.print("最高分为:"+max+"\n最低分为:"+min+"\n平均分为:"+avg);
		

	}
}