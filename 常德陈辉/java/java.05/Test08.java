/*ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ����*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("��ѡ�������Ʒ��ţ�\n1.T ��\t2.����Ь\t3.������\n*************************");
	System.out.print("\n��������Ʒ��ţ�");
	String a=input.next();
	int i;
	for(;!a.equals("n");){
		switch(a){
			case "1":
				System.out.println("T ��\t��245");
				break;
			case "2":
				System.out.println("����Ь\t��570");
				break;
			case "3":
				System.out.println("������\t��320");
				break;
			}
		System.out.println("�Ƿ������y/n)");
		a=input.next();
		if(!a.equals("n")){
			System.out.print("��������Ʒ��ţ�");
			a=input.next();
			}
		}
	System.out.print("�������");
	}

}