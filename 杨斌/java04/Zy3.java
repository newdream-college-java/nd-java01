import java.util.Scanner;
public class Zy3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�����������Σ�");		
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("���μ���ʡ����ѧ��֯��һ��������Ӫ");				
				break;
			case 2:
				System.out.println("���������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�������ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("û�н���");
				break;
		}
	}

}