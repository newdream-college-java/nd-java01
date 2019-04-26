import java.util.Scanner;
public class Zy5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] a=new double[11];
		double x=0,z=0,s=0,sum=0,max=0,min=100;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"个同学的成绩");			
			a[i]=input.nextInt();
			if(a[i]<60){
				x++;
			}if(a[i]<=80&&a[i]>=60){
				z++;
			}if(a[i]>80){
				s++;
			}
			sum+=a[i];
			
		}
		for(int i=1;i<=10;i++){
		if(a[i]<min){
			
				min=a[i];
			}	
		}
		for(int i=1;i<=10;i++){
			if(a[i]>max){
				
				max=a[i];
			}
		}
		sum=sum/10;
		System.out.println("平均分"+sum+"\n最大"+max+"\n最小"+min+"\n60分以下的"+x+"\n60-80的有"+z+"\n80以上的"+s);
	}

}
