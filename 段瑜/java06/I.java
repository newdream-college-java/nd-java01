import java.util.Scanner;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		int i=1;
		while(i<=3){
			System.out.println("�������Ա�ţ�4λ��������");
			int sum=input.nextInt();
			if(sum<10000){
			System.out.println("�������Ա���գ���/�գ���λ������ʾ������");
			String a=input.next();
			System.out.println("�������Ա���֣�");
			int sum1=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�"+sum+"\t"+a+"\t"+sum1);
			}else{
				System.out.println("¼��ʧ�ܣ�");
				continue;
			}
			i++;
		}
		System.out.println("¼�������");
	}
}