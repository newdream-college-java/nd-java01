/*�Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮��
��ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ������");
	int a=input.nextInt();
	int i;
	for(i=a;i!=0;i=a){
		switch(a){
			case 1:
				System.out.print("MON\n���ٴ�����");
				break;
			case 2:
				System.out.print("TUE\n���ٴ�����");
				break;
			case 3:
				System.out.print("WED\n���ٴ�����");
				break;
			case 4:
				System.out.print("THU\n���ٴ�����");
				break;
			case 5:
				System.out.print("FRI\n���ٴ�����");
				break;
			case 6:
				System.out.print("SAT\n���ٴ�����");
				break;
			case 7:
				System.out.print("SUN\n���ٴ�����");
			default:
				System.out.print("�����������������");
			}
		a=input.nextInt();
		}
	System.out.print("�������");
	}

}