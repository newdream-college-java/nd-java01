/**
**ѭ������5��ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫȥʹ��continue������
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;  //����ͳ�ƴ���80�ֵ�ѧ������
		//ѭ������5��ѧ���ɼ�
		for(int i=1;i<=5;i++){
			System.out.print("�����"+i+"��ѧ���ĳɼ�:");
			int a=input.nextInt();
			//ͳ�ƴ���80�ֵ�ѧ������
			if(a<=80){
				continue;
			}
			sum++;
		}
		//�������80�ֵ�ѧ������
		System.out.println();
		System.out.println("����80�ֵ�ѧ������Ϊ"+sum);
	}
}