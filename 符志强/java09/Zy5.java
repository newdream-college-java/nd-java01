import java.util.Scanner;
public class Zy5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] a=new double[11];
		double x=0,z=0,s=0,sum=0,max=0,min=100;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"��ͬѧ�ĳɼ�");			
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
		System.out.println("ƽ����"+sum+"\n���"+max+"\n��С"+min+"\n60�����µ�"+x+"\n60-80����"+z+"\n80���ϵ�"+s);
	}

}
