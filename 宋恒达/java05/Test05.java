/**
**ѭ��Ҫ���û�����һ��0��2֮���������
**����������0��������������ʯͷ����
**����������0�������������Ǽ�������
**����������2�������������ǲ���
**������������ͽ�������
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
   		boolean flag=true;
		Scanner input=new Scanner(System.in);
		while(flag){
			System.out.print("������һ��0-2������:");
			int a=input.nextInt();
			switch(a){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
				default:
					flag=false;
					System.out.println("����ָ�����");
					System.exit(-1);
				
			}
		
		}
	}
}