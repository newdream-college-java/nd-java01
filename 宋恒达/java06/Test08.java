/**
**ѭ������5��ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫ��ʹ��continue������
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			sum++;
		}
		System.out.println("��"+sum+"���˵ĳɼ�����80");
	}
}