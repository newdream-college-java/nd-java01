//ͳ�����ָ���
import java.util.*;
public class work4{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int m=0,n=0,l=0;
		for(;;){
			System.out.print("���������֣�");
			double a = input.nextDouble();
			if(a==999){
				break;
			}
			if(a>0){
				m++;
			}
			if(a<0){
				n++;
			}
			if(a==0){
				l++;
			}
		}
		System.out.print("�����ĸ���Ϊ"+m+"\t�����ĸ���Ϊ"+n+"\t0�ĸ���Ϊ"+l);
	}
}