/*
scanner.hasnextint() �����Ϊ boolean��
�����һ��token��integer�����true������false��
boolean a = scanner.hasnextint();
if(a){//�¸�input������

}else{//�¸�input��������
}

*/
import java.util.Scanner;
public class java08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ļ�Ա��(4λ����)�����գ�����");
		String birthday ;
		int score;
		if(input.hasNextInt()==true){
			/*if(input.nextInt<10000&&input.nextInt>999){
				System.out.println("��Ļ�Ա�źϷ�");
			}else{
				System.out.println("������Ļ�Ա�Ų��Ϸ�");
			}
			*/
			int num = input.nextInt();
			if(num>999&&num<10000){
				System.out.println("��Ա������Ϸ���������������գ�����");
				birthday=input.next();
				score = input.nextInt();
				System.out.println("��Ա�ţ�"+num+"\t"+"���գ�"+birthday+"���֣�"+score);
			}else{
				System.out.println("��Ա�����벻�Ϸ����������");
				System.exit(-1);//������������
			}

		}else{
			System.out.println("��Ա���������󣬳������");
			System.exit(-1);//������������
		}
	}
}