import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�㰮����");
		String hd =input.next();
		switch(hd){
			case "yes":
				System.out.println("���ǰ��ҵ�");
				break;
			case "no":
				System.out.println("ԭ���㲻����");
				break;
			default:
				System.out.println("�Ҳ�֪���㰮������");
			
		}
	}
}