/*ѭ������5��ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫ��ʹ��continue�����ɡ�*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=0;
	for(int i=1;i<6;i++){
		System.out.print("������ɼ���");
		int score=input.nextInt();
		if(score<=80){
			continue;
		}
		a++;
	}
	System.out.print("����80�ֵ���"+a+"��");
	}

}