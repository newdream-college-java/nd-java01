package zuoye;

import java.util.Arrays;
import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[]a=new double[10];
		for(int i=0;i<=9;i++){
			System.out.println("�������"+(i+1)+"��ѧ���ɼ���");
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
		System.out.println("С��60�ֵ���"+b+"����60-80�ֵ���"+c+"��������80�ֵ���"+d+"��");
		System.out.println("���ֵΪ:"+a[a.length-1]+"��СֵΪ��"+a[0]+"ƽ����Ϊ��"+sum/10.0);
	}

}
