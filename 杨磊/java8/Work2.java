//ѭ����������ѧ���ĳɼ���ͳ���ж��ٸ��˵ĳɼ�����80��Ҫ��ʹ��continue������
import java.util.Scanner;
public class Work2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"λͬѧ�ĳɼ���");
			double a=input.nextDouble();
			if(a<=80){
				continue;
			}
			count++;
		}	
			System.out.print("����80�ֵ�ͬѧ��"+count+"λ");
	}
}