/**
**������ AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ 4 λ����) 
**/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=-1;
		System.out.print("�������Ա�ţ�4λ��������");
		if(input.hasNextInt()){
			num=input.nextInt();
		}else{
			System.out.println("�����Ա�Ų��Ϸ�");
			System.exit(-1);
		}
		System.out.print("�������Ա���գ���/�գ�:");
		String birth=input.next();
		System.out.print("���������:");
		int score=input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(num+"\t"+birth+"\t"+1000);
	}
}