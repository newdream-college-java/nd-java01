import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������Ļ�Ա�˺�:");
		int hy=input.nextInt();

		if(1000<=hy&&hy<=9999){
			System.out.print("�������������:");
			String sr=input.next();
			System.out.print("�����������:");
			int jf=input.nextInt();
			System.out.print("��Ļ�Ա�˺�Ϊ��"+hy+"\n�������Ϊ��"+sr+"\n��Ļ���Ϊ��"+jf);


		}else{
			System.out.print("������Ļ�Ա�˺Ų��ԣ����������룡");
		
		}


	}




}