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
			System.out.print("�������"+i+"��ͬѧ�ĳɼ���");
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
		System.out.println("����60�ֵ���:"+b+"\t60~80��(��60����80��)�У�"+d+"\t���ڵ���80�ֵ��У�"+c+"\n��СֵΪ��"+a[0]+"\n���ֵΪ��"+a[10-1]+"\nƽ��ֵΪ��"+sum/10);
		
	}
}