import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա�ţ�");
		int mun=input.nextInt();
		System.out.println("���������պţ�");
		int mun1=input.nextInt();
		System.out.println("��������֣�");
		int mun2=input.nextInt();
		if(mun>=1000&&mun<10000){
			System.out.println("��Ա���ǣ�"+mun);
			System.out.println("���պ��ǣ�"+mun1);
			System.out.println("���ֺ��ǣ�"+mun2);
		}else{
			System.out.println("��Ա�ű�����4λ��");
		}
	}
}