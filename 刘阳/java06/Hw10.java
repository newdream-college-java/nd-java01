import java.util.Scanner;
public class Hw10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��<4λ����>:");
			int a=input.nextInt();
			if(a<1000||a>9999){
				System.out.print("¼��ʧ�ܣ�");
				System.exit(-1);
			}
			System.out.print("�������Ա����(��/��<����λ������ʾ>)");
			int b=input.nextInt();
			if(b<1||b>12){
				System.out.print("¼��ʧ�ܣ�");
				System.exit(-1);
			}
			int c=input.nextInt();
			if(c<1||c>31){
				System.out.print("¼��ʧ�ܣ�");
				System.exit(-1);
			}
			System.out.print("�������Ա����:");
			int d=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println(a+"\t"+b+"/"+c+"\t"+d);
		}
		System.out.println();
		System.out.println("�������!");
	}
}