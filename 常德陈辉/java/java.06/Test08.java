/*ѭ����������ѧ���ĳɼ���ͳ�����ж����˵ĳɼ�����80�֣�Ҫ��ʹ��continue�������ɡ�*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int num=0;
	for(int i=1;i<6;i++){
		System.out.print("��"+i+"��ѧ���ĳɼ�:");
		int score=input.nextInt();
		if(score<80){
			continue;
			}
		num++;
		}
	System.out.print(num+"���ɼ�����80��");
	}

}