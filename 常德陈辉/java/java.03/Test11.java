/*������AddCust¼���Ա��Ϣ��������Ա�ţ����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�������Ϊ4λ����*/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�������Ա�ţ�<4λ����>����");
	int a=input.nextInt();
	System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
	String str=input.next();
	System.out.print("��������֣�");
	int b=input.nextInt();
	System.out.println("\n��¼�õĻ�Ա��Ϣ�ǣ�\n"+a+"\t\t"+str+"\t\t"+b);
	}

}