/*
������AddCust¼���Ա��Ϣ��������Ա�ţ����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�������Ϊ4λ������
*/
import java.util.Scanner;

public class AddCust{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������û���Ա����");
		int numb = input.nextInt(),jf ;
		System.out.print("�������û����գ�");
		String birthday = input.next();
		System.out.print("�������û����֣�");
		jf =  input.nextInt();
		if(numb/1000!=0){
			System.out.print("��Ա�ţ�"+numb+"\n���գ�"+birthday+"\n���֣�"+jf);
		}else{
			System.out.println("������4λ���ֻ�Ա��");
			System.exit(-1);
		}
	}
}